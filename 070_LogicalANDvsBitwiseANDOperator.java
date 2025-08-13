import java.util.Scanner;

class LogicalANDvsBitwiseANDOperator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        if(isRaining() && isSaturday()) { // LOGICAL AND operator is used here.
            System.out.println("Please do not go out of home!");
        }
        else {
            System.out.println("You can comfortable step out of your home!");
        }

        System.out.println();

        if(isRaining() & isSaturday()) { // BITWISE AND operator is used here.
            System.out.println("Please do not go out of home!");
        }
        else {
            System.out.println("You can comfortable step out of your home!");
        }
        scanner.close();
    }

    public static boolean isRaining() {
        System.out.println("Is it raining today?");
        final boolean isRaining = scanner.nextBoolean();
        return isRaining;
    }

    public static boolean isSaturday() {
        System.out.println("Is it Saturday today?");
        final boolean isSaturday = scanner.nextBoolean();
        return isSaturday;
    }
}

/*

Is it raining today?
false
You can comfortable step out of your home!  => EVALUATION OF ONLY 1ST CONDITION (WHICH WAS FALSE) WAS ENOUGH TO DETERMINE THE OUTCOME OF THE EXPRESSION. 2ND CONDITION WAS NOT EVALUATED.

Is it raining today?
false
Is it Saturday today?
true
You can comfortable step out of your home!

*/
