import java.util.Scanner;

class NumberToCharConversion 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a digit from 0-9 : ");
        final int digit = scanner.nextInt();

        final char ch = (char)(digit + '0');
        System.out.println("Character corresponding to the digit : "+digit+" = \'"+ch+"\'");

        scanner.close();
    }    
}
