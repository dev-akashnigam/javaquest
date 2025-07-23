import java.util.Scanner;

class ReadDecimalNumberAndPrint 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number : ");
        float num = scanner.nextFloat();

        System.out.println("The number you have entered is : ");
        System.out.print(num);

        scanner.close();
    }    
}
