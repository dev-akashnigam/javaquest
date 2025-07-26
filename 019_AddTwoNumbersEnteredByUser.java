import java.util.Scanner;

class AddTwoNumbersEnteredByUser
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter another number : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of "+num1+" and "+num2+" : "+sum);
        
        scanner.close();
    }    
}
