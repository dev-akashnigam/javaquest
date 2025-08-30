import java.util.Scanner;
class CalculateHCFOptimized {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int myFirstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int mySecondNum = scanner.nextInt();

        while(mySecondNum!=0) {
            int firstNumModSecondNum = myFirstNum % mySecondNum;
            myFirstNum = mySecondNum;
            mySecondNum = firstNumModSecondNum;
        }
        System.out.printf("HCF = %d", myFirstNum);
        scanner.close();
    }
}
