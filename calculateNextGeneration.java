class calculateNextGeneration {
     private int row,col;
     private Grid [][] nextgrid;
     private userInput obj = new userInput();
     calculateNextGeneration(int row, int col, userInput obj)
     {
         this.row = row;
         this.col = col;
         this.obj = obj;
         nextgrid = new Grid[row][col];
     }
     int sum(int x, int y)
    {
        int sum =0;
        for(int i=-1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                sum += obj.get((x+i+row)%row,(y+j+col)%col);
            }
        }
        return sum;
    }
    void generate()
    {
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                if(obj.get(i,j) == 1 && (sum(i,j) > 3 || sum(i,j) < 2))
                {
                    nextgrid[i][j] = new Grid(0);
                }
                else if(obj.get(i,j) == 0 && sum(i,j) == 3)
                {
                    nextgrid[i][j] = new Grid(1);
                }
                else
                {
                    nextgrid[i][j] = new Grid(obj.get(i,j));
                }
            }
        }
    }
     void print()
     {
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 System.out.print(nextgrid[i][j].get());
             }
             System.out.println();
         }
     }
}
