import java.util.Scanner;

class Function_FindMaxOfTwo {

    public static int getMaxOfTwo(int a, int b) {
        if(a >= b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = scanner.nextInt();

        int largerNumber = getMaxOfTwo(firstNum, secondNum);

        System.out.printf("Larger of the numbers %d and %d = %d %n", firstNum, secondNum, largerNumber);

        scanner.close();
    }
    
}
