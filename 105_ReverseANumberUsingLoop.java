import java.util.Scanner;
class ReverseANumberUsingLoop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int lastDigit;
        int reversedNumber = 0;
        int originalNumber = myNum;

        while(myNum != 0) {
            lastDigit = myNum % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;

            myNum /= 10;
        }

        System.out.printf("Reverse of number: %d = %d", originalNumber, reversedNumber);
        scanner.close();
    }
}
