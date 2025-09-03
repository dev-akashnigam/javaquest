import java.util.Scanner;
import java.util.function.Function;
class Lambda_CalculateSquare {

    /*
     * 'function' is a static reference/variable of Function<A,B> interface to which the anonymous function is assigned.
     * That's why the overall expression below ends with a semicolon (;).
    */

    public static Function<Integer, Integer> function = (num) -> {
        int squareOfNum = num * num;
        return squareOfNum;
    };
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int myNum = scanner.nextInt();

        int square = function.apply(myNum);
        System.out.printf("Square of number: %d = %d %n", myNum, square);

        scanner.close();
    }
}
