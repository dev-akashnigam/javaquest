import java.util.Scanner;

class CharacterToTextConversion
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character : ");
        char ch = scanner.next().charAt(0);

        String textForChar = String.valueOf(ch);
        System.out.println("Text corresponding to the character: '"+ch+"' = "+textForChar);

        scanner.close();
    }
}