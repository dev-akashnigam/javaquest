import java.util.Scanner;

class SquareAndCubeRoot_1 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        final double number = scanner.nextDouble();

        final double squareRoot = Math.sqrt(number);
        final double cubeRoot = Math.cbrt(number);

        System.out.println("Square root of number: "+number+" is = "+squareRoot);
        System.out.println("Cube root of number: "+number+" is = "+cubeRoot);

        scanner.close();
    }
}
