import java.util.Scanner;

class Print1toNOnSameLine {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number till where you want to print the natural numbers: ");
        int myNum = scanner.nextInt();

        for(int i=1; i<=myNum; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    } 
}
