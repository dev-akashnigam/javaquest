import java.util.Scanner;
class PrintDigitsOfNumInReverseOrder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        int lastDigit;

        while(myNum != 0) {
            lastDigit = myNum%10;
            myNum = myNum/10;
            
            System.out.printf("%d \n", lastDigit);
        }

        scanner.close();
    }
}
