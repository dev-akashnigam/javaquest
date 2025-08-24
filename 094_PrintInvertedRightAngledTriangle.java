import java.util.Scanner;

class PrintInvertedRightAngledTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows to print in the inverted right angled triangle: ");
        int myRows = scanner.nextInt();

        for(int i=myRows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
