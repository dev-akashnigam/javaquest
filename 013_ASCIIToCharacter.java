import java.util.Scanner;

class ASCIIToCharacter 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int ascii = scanner.nextInt();

        System.out.println("The number you have enetered is : ");
        System.out.println(ascii);

        char ch = (char)ascii;
        System.out.println("Character corresponding to ASCII value "+ascii+ " is : ");
        System.out.print(ch);

        scanner.close();
    }    
}
