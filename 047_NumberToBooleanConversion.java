import java.util.Scanner;

class NumberToBooleanConversion 
{
    // In Java, there is no direct way of converting a number (int, long, float, double) to boolean.
    // The concept is 0 should result in false and non-zero value should result in true.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        final int num = scanner.nextInt();

        final boolean bool = (num !=0);  // this is the manual way of converting a number to boolean value in Java

        System.out.println("boolean value corresponding to the number : "+num+" = "+bool);

        scanner.close();
    }    
}
