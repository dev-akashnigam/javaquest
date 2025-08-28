import java.util.Scanner;
class CalculateHCF {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int myNum1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int myNum2 = scanner.nextInt();

        int smallerNum = Math.min(myNum1, myNum2);
        int largerNum = Math.max(myNum1, myNum2);

        int hcf = 1;
        if(largerNum%smallerNum==0) {
            hcf = smallerNum;
        }
        else {
            for(int i=smallerNum/2; i>=2; i--) {
                if(largerNum%i == 0 && smallerNum%i == 0) {
                    hcf = i;
                    break;
                }
            }
        }   
        System.out.printf("HCF of %d and %d = %d", myNum1, myNum2, hcf);
        scanner.close();
    }
}
