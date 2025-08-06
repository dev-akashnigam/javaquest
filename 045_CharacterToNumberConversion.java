import java.util.Scanner;

class CharacterToNumberConversion 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character (digit between 0-9) : ");
        final char ch = scanner.next().charAt(0);

        final int numForCharacter = Integer.parseInt(String.valueOf(ch)); // character -> text -> number
        System.out.println("Number corresponding to the character: '"+ch+"' = "+numForCharacter);

        scanner.close();
    }
}
