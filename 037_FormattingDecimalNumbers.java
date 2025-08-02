import java.util.Scanner;

class FormattingDecimalNumbers 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number : ");
        double decimalNo = scanner.nextDouble();

        String formattedDecimalNo = String.format("%.3f", decimalNo);

        System.out.println("On formatting decimal number: "+decimalNo+" to 3 decimal places, the number becomes = "+formattedDecimalNo);

        scanner.close();
    }    
}
