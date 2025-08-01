import java.util.Scanner;

class SquareAndCubeRoot 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        final double number = scanner.nextDouble();

        final double squareRoot = Math.pow(number, (1.0/2.0)); // It is 1.0/2.0 and not 1/2 because 1/2 returns integer instead of decimal number.
        final double cubeRoot = Math.pow(number, (1.0/3.0)); // It is 1.0/3.0 and not 1/3 because 1/3 returns integer instead of decimal number.

        System.out.println("Square root of number: "+number+" is = "+squareRoot);
        System.out.println("Cube root of number: "+number+" is = "+cubeRoot);

        scanner.close();
    }    
}
