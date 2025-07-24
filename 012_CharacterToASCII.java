import java.util.Scanner;

class CharacterToASCII 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character : ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("The character that you have entered is : "+ ch);

        int asciiValue = (int)ch;

        System.out.println("ASCII value of character '"+ch+"' is: "+asciiValue);
        scanner.close();
    }    
}
