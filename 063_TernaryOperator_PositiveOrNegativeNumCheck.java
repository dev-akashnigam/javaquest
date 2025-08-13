import java.util.Scanner;

class TernaryOperator_PositiveOrNegativeNumCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a real number: ");
        int myNum = scanner.nextInt();

        String outputString = (myNum >= 0) ? "Number: "+myNum+" is POSITIVE!" : "Number: "+myNum+" is NEGATIVE!";

        System.out.println(outputString);

        scanner.close();
    }
}