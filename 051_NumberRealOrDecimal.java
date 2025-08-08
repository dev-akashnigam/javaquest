import java.util.Scanner;

class NumberRealOrDecimal 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        double myNum = scanner.nextDouble();

        double flooredNum = Math.floor(myNum);

        if(flooredNum == myNum)
            System.out.println("Number is a real number (integer)!");
        else
            System.out.println("Number is a decimal number!");

        scanner.close();
    }    
}
