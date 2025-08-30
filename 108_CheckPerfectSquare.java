import java.util.Scanner;
class CheckPerfectSquare {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to be checked for perfect square: ");
        int myNum = scanner.nextInt();

        int integerSquareRootOfNum = (int) Math.sqrt(myNum);

        if(integerSquareRootOfNum * integerSquareRootOfNum == myNum) {
            System.out.printf("%d is a perfect square", myNum);
        }
        else {
            System.out.printf("%d is NOT a perfect square", myNum);
        }
        scanner.close();
    }
}
