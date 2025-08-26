/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;
class PrintFloydsTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows to be printed in the Floyd's triangle: ");
        int myRows = scanner.nextInt();

        int currentNumToPrint = 1;
        for(int i=1; i<=myRows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(currentNumToPrint+" ");
                currentNumToPrint++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
