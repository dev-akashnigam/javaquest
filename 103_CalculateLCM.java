import java.util.Scanner;
class CalculateLCM {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int myFirstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int mySecondNum = scanner.nextInt();

        int greaterNumber = Math.max(myFirstNum, mySecondNum);
        int smallerNumber = Math.min(myFirstNum, mySecondNum);

        int lcm = myFirstNum * mySecondNum;;
        if(greaterNumber%smallerNumber == 0) {
            lcm = greaterNumber;
        }
        else {
            for(int i=2;; i++) {
                int greaterNumberMultiple = greaterNumber * i;
                if(greaterNumberMultiple%smallerNumber == 0) {
                    lcm = greaterNumberMultiple;
                    break;
                }
            }
        }
        System.out.printf("LCM of %d and %d = %d", myFirstNum, mySecondNum, lcm);
        scanner.close();
    }
}