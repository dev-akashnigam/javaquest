import java.util.Scanner;

class CalculateSquareAndCube 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        double num = scanner.nextDouble();

        double square = num * num;
        double cube = num * num * num;

        System.out.println("Square of number "+num+" = "+square);
        System.out.println("Cube of number "+num+" = "+cube);

        scanner.close();
    }    
}
