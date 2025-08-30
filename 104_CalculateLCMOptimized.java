import java.util.Scanner;
class CalculateLCMOptimized {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNum = scanner.nextInt();
        int originalFirstNum = firstNum;

        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        int originalSecondNum = secondNum;

        while(secondNum!=0) {
            int mod = firstNum % secondNum;
            firstNum = secondNum;
            secondNum = mod;
        }

        int hcf = firstNum;

        int lcm = (originalFirstNum/hcf) * originalSecondNum;

        System.out.printf("LCM = %d", lcm);

        scanner.close();
    }   
}
