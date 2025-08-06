import java.util.Scanner;

class TextToCharConversion 
{
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter a character : ");
        String stringInput = scanner.nextLine();

        char ch = stringInput.charAt(0);

        System.out.println("Character corresponding to the string \""+stringInput+"\" = "+ch);

        scanner.close();
    }    
}
