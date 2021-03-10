import java.util.Scanner;

  class userInput {
     private int row,col;
     private Grid [][] grid;
     userInput() {}
     userInput(int row, int col)
     {
         this.row = row;
         this.col = col;
         grid = new Grid[row][col];
     }
     void initialize(Scanner input) {
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 grid[i][j] = new Grid(input.nextInt());
             }
         }
     }
     int get(int i, int j)
     {
         return grid[i][j].get();
     }
     void print()
     {
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j].get());
             }
             System.out.println();
         }
     }
}
