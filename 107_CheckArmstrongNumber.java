import java.util.Scanner;
class CheckArmstrongNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int countOfDigitsInNum = (int)Math.floor(Math.log10(myNum)) + 1;

        int lastDigit;
        int lastDigitPower;
        int sumLastDigitsSquares = 0;
        int originalNumber = myNum;

        while(myNum!=0) {
            lastDigit = myNum % 10;
            lastDigitPower = (int)Math.pow(lastDigit, countOfDigitsInNum);
            sumLastDigitsSquares += lastDigitPower;

            myNum /= 10;
        }

        if(sumLastDigitsSquares == originalNumber) {
            System.out.printf("Number: %d is armstrong number.", originalNumber);
        }
        else {
            System.out.printf("Number: %d is NOT a armstrong number.", originalNumber);
        }
        scanner.close();
    }
}
