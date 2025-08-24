import java.util.Scanner;

class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of terms to print the fibonacci series: ");
        int myNoOfTerms = scanner.nextInt();

        int firstTermOfFibonacci = 0;
        int secondTermOfFibonacci = 1;

        if(myNoOfTerms == 0) {
        }
        else if(myNoOfTerms == 1) {
            System.out.println(firstTermOfFibonacci+" ");
        }
        else if(myNoOfTerms == 2) {
            System.out.println(firstTermOfFibonacci+" "+secondTermOfFibonacci+" ");
        }
        else {
            System.out.print(firstTermOfFibonacci+" "+secondTermOfFibonacci+" ");
            int currentNoOfTerms = 2;
            while(currentNoOfTerms < myNoOfTerms) {
                int nextTerm = firstTermOfFibonacci + secondTermOfFibonacci;
                System.out.print(nextTerm+" ");

                firstTermOfFibonacci = secondTermOfFibonacci;
                secondTermOfFibonacci = nextTerm;
                currentNoOfTerms++;
            }
        }
        scanner.close();
    }
}
