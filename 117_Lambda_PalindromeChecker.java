import java.util.Scanner;
import java.util.function.Function;
class Lambda_PalindromeChecker {

    public static Function<Integer, Boolean> function = (num) -> {
        int originalNum = num;

        int lastDigit;
        int reversedNum = 0;

        while(num!=0) {
            lastDigit = num%10;
            reversedNum = (reversedNum * 10) + lastDigit;

            num /= 10;
        }

        return reversedNum==originalNum;
    };

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        boolean isNumPalindrome = function.apply(myNum);

        System.out.printf("Number: %d is palindrome = %b%n", myNum, isNumPalindrome);

        scanner.close();
    }
}
