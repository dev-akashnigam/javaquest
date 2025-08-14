import java.util.Scanner;

class ToggleCharacterCase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        char toggledCaseChar;

        if(Character.isLowerCase(myChar)) {
            toggledCaseChar = Character.toUpperCase(myChar);
        }
        else {
            toggledCaseChar = Character.toLowerCase(myChar);
        }

        System.out.println("Character: "+myChar+" on toggling the case becomes = "+toggledCaseChar);

        scanner.close();
    }
}
