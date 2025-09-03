import java.util.Scanner;

class Function_PalindromeChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        boolean isNumPalindrome = isPalindrome(myNum);

        System.out.printf("Number: %d is palindrome = %b%n", myNum, isNumPalindrome);

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;

        int lastDigit;
        int reversedNum = 0;
        while(num!=0) {
            lastDigit = num%10;
            reversedNum = (reversedNum * 10) + lastDigit;

            num /= 10;
        }

        if(reversedNum == originalNum) {
            return true;
        }
        else {
            return false;
        }
    }
}
