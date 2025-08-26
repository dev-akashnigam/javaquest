/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.Scanner;
class LeftAlignedHalfNumberPyramid {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows to be printed in the left aligned half number pyramid: ");
        int myRows = scanner.nextInt();

        for(int i=1; i<=myRows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
