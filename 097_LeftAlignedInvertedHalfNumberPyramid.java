/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

import java.util.Scanner;
class LeftAlignedInvertedHalfNumberPyramid {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows to be printed in the inverted left aligned half number pyramid: ");
        int myRows = scanner.nextInt();

        for(int i=1; i<=myRows; i++) {
            for(int j=myRows; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
