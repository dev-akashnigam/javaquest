import java.util.Scanner;

class TernaryOperator_AlphabetCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        boolean isAlpha = ( (myChar >= 65 && myChar <=90) || (myChar >=97 && myChar<=122) ) ? true : false;  // multiple conditions combined with ternary operator.

        System.out.println("Character: "+myChar+" is an alphabet is = "+isAlpha);

        scanner.close();
    }
}
