import java.util.Scanner;

class PrintEvenNosFrom1ToN {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number till where you want the even numbers to te printed: ");
        int myNum = scanner.nextInt();

        for(int i=2; i<=myNum; i+=2) {
            System.out.println(i);
        }
        scanner.close();
    }
}
