import java.util.Scanner;

class CountDigitsInNum_UsingLog {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int countOfDigits = (int)(Math.floor(Math.log10(myNum))) + 1;

        System.out.printf("Count of digits = %d", countOfDigits);

        scanner.close();
    }
}
