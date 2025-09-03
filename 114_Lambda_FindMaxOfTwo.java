import java.util.Scanner;
import java.util.function.BiFunction;

class Lambda_FindMaxOfTwo {

    public static BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> {
        if(a>=b) {
            return a;
        }
        else {
            return b;
        }
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = scanner.nextInt();

        int largerNumber = bifunction.apply(firstNum, secondNum);

        System.out.printf("Larger of the numbers %d and %d = %d %n", firstNum, secondNum, largerNumber);

        scanner.close();
    }
}
