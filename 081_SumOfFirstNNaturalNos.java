import java.util.Scanner;

class SumOfFirstNNaturalNos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the natural number till where you want the sum: ");
        int myNaturalNum = scanner.nextInt();
        
        int sum = 0;
        for(int i=1; i<=myNaturalNum; i++) {
            sum += i;
        }

        System.out.printf("Sum of first %d natural numbers = %d", myNaturalNum, sum);

        scanner.close();
    }
}
