import java.util.Scanner;

class AlphabetDigitOrSpecialCharacterV2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        if(Character.isAlphabetic(myChar)) {
            System.out.println("Character: "+myChar+" is an alphabet!");
        }
        else if(Character.isDigit(myChar)) {
            System.out.println("Character: "+myChar+" is a digit!");
        }
        else {
            System.out.println("Character: "+myChar+" is a special character!");
        }

        scanner.close();
    }    
}
