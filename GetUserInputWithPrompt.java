import java.util.Scanner;

public class GetUserInputWithPrompt 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Welcome, "+ name);

        scanner.close();
    }    
}
