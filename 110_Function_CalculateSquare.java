import java.util.Scanner;
class Function_CalculateSquare {

    public static int getSquare(int num) {
        int squareOfNum = num * num;
        return squareOfNum;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int myInteger = scanner.nextInt();

        int square = getSquare(myInteger);
        System.out.printf("Square of number: %d is = %d", myInteger, square);

        scanner.close();
    }
}
