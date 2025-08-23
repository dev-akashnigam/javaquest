import java.util.Scanner;

class CheckPrime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        boolean isPrime;

        if(myNum<=1) {
            isPrime = false;
        }
        else if(myNum==2 || myNum==3) {
            isPrime = true;
        }
        else if(myNum%2==0) {
            isPrime = false;
        }
        else {
            isPrime = true;
            for(int i=3; i<=(int)Math.sqrt(myNum); i+=2) {
                if(myNum%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.printf("Number: %d is prime.", myNum);
        }
        else {
            System.out.printf("Number: %d is not prime.", myNum);
        }
        scanner.close();
    }
}
