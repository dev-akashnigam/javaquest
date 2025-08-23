import java.util.Scanner;

class PrintDigitsOfNumberFromForward {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int myNumCopy = myNum;
        
        //finding the count of digits in the input number.
        int countOfDigits = 0;
        while(myNum!=0) {
            countOfDigits++;
            myNum /= 10;
        }

        myNum = myNumCopy;

        int divisor = (int)(Math.pow(10, countOfDigits-1));

        int firstDigit;
        while(divisor!=0) {
            firstDigit = myNum / divisor;
            System.out.println(firstDigit);

            myNum %= divisor;
            divisor /= 10;
        }

        scanner.close();
    }
}
