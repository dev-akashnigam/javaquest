import java.util.Scanner;

class FactorialOfNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number for which you need factorial: ");
        int myNum = scanner.nextInt();

        int factorial = 1;
        for(int i=myNum; i>=1; i--) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", myNum, factorial);
        scanner.close();
    }
}
