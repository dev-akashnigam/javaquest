/*
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5 
*/

import java.util.Scanner;
class CenterAlignedHalfNumberPyramid {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows to be printed in the center aligned half number pyramid: ");
        int myRows = scanner.nextInt();

        for(int i=1; i<=myRows; i++) {
            for(int j=myRows; j>=1; j--) {
                if(j<=i) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
