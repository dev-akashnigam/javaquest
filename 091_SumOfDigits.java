import java.util.Scanner;

class SumOfDigits {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int lastDigit;
        int sumOfDigits = 0;
        while(myNum!=0) {
            lastDigit = myNum % 10;
            sumOfDigits += lastDigit;
            myNum /= 10;
        }

        System.out.printf("Sum of digits is = %d", sumOfDigits);

        scanner.close();
    } 
}
