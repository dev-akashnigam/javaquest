import java.util.Scanner;
class CheckNumberForFibonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number to be checked for fibonacci: ");
        int myNum = scanner.nextInt();

        long fiveNSquarePlus4 = (5 * myNum * myNum) + 4;
        long fiveNSquareLess4 = (5 * myNum * myNum) - 4;

        double fiveNSquarePlus4SquareRoot = Math.sqrt(fiveNSquarePlus4);
        double fiveNSquareLess4SquareRoot = Math.sqrt(fiveNSquareLess4);

        boolean isFiveNSquarePlus4SquareRootInteger = Math.floor(fiveNSquarePlus4SquareRoot) == fiveNSquarePlus4SquareRoot;
        boolean isFiveNSquareLess4SquareRootInteger = Math.floor(fiveNSquareLess4SquareRoot) == fiveNSquareLess4SquareRoot;

        if(isFiveNSquarePlus4SquareRootInteger ||  isFiveNSquareLess4SquareRootInteger) {
            System.out.printf("Number: %d is a fibonacci number.", myNum);
        }
        else {
            System.out.printf("Number: %d is NOT a fibonacci number.", myNum);
        }
        scanner.close();
    }
}
