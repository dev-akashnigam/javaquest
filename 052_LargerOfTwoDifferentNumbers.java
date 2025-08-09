import java.util.Scanner;

class LargerOfTwoDifferentNumbers 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        double firstNum = scanner.nextDouble();

        System.out.println("Please enter another number : ");
        double secondNum = scanner.nextDouble();

        if(firstNum > secondNum) {
            System.out.println(firstNum+" is greater than "+secondNum);
        }
        else {
            System.out.println(secondNum+" is greater than "+firstNum);
        }

        scanner.close();
    }    
}
