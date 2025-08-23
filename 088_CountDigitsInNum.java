import java.util.Scanner;
class CountDigitsInNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int noOfDigits = 0;

        while(myNum != 0) {
            noOfDigits++;
            myNum = myNum / 10;
        }

        System.out.printf("Number of digits = %d", noOfDigits);

        scanner.close();
    }
}
