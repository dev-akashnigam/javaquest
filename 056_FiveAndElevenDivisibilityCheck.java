import java.util.Scanner;

class FiveAndElevenDivisibilityCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a real number : ");
        int myNum = scanner.nextInt();

        if(myNum%5 == 0) {
            if(myNum%11 == 0) {
                System.out.println("Number: "+myNum+" is divisible by both 5 and 11.");
            }
            else {
                System.out.println("Number: "+myNum+" is divisible by 5 but NOT by 11.");
            }
        }
        else {
            if(myNum%11 == 0) {
                System.out.println("Number: "+myNum+" is NOT divisible by 5 but divisible by 11.");
            }
            else {
                System.out.println("Number: "+myNum+" is neither divisible by 5 nor by 11.");
            }
        }

        scanner.close();
    }
}
