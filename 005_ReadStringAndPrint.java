import java.util.Scanner;

class ReadStringAndPrint
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string : ");
        String str = scanner.nextLine();

        System.out.println("You entered the following string : ");
        System.out.print(str);

        scanner.close();
    }    
}
