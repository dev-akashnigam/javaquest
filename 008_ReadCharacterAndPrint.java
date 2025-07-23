import java.util.Scanner;

class ReadCharacterAndPrint 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character");
        char ch = scanner.next().charAt(0);

        System.out.println("The character that you have entered is : ");
        System.out.print(ch);

        scanner.close();
    }
}
