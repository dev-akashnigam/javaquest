import java.util.Scanner;

class CheckNumberForPalindrome {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Please enter a number: ");
       int myNum = scanner.nextInt();

       int originalNumber = myNum;
       int lastDigit;
       int reversedNumber = 0;

       while(myNum!=0) {
            lastDigit = myNum % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;

            myNum = myNum / 10;
       }

       if(reversedNumber == originalNumber) {
            System.out.printf("Number: %d is palindrome = true", originalNumber);
       }
       else {
            System.out.printf("Number: %d is palindrome = false", originalNumber);
       }
       scanner.close();
    }
}
