import java.util.Scanner;

class ReadIntegerAndPrint 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The number that you have entered is : ");
        System.out.print(num);

        scanner.close();
    }    
}
