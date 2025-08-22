import java.util.Scanner;

class MultiplicationTableOfN {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for which you need the multiplication table: ");
        int myNum = scanner.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d \n", myNum, i, (myNum*i));
        }

        scanner.close();
    }
}
