import java.util.Scanner;
class game  {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        // input the identity matrix since it is orthogonal
        userInput obj = new userInput(row,col);
        obj.initialize(input);
        System.out.println("Input Matrix");
        obj.print();
        calculateNextGeneration next = new calculateNextGeneration(row,col,obj);
        next.generate();
        System.out.println("Output Matrix");
        next.print();
    }
}
