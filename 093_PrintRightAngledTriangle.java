import java.util.Scanner;

class PrintRightAngledTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows in the right angled triangle: ");
        int myRows = scanner.nextInt();

        for(int i=1; i<=myRows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
