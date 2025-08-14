import java.util.Scanner;

class ToogleCharacterCaseV2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        int asciiMyChar = (int)myChar;

        char toggledChar;

        if(asciiMyChar>=65 && asciiMyChar<=90) {
            toggledChar = (char)(myChar + 32);
        }
        else {
            toggledChar = (char)(myChar - 32);
        }

        System.out.println("Character: "+myChar+" on case toggling becomes = "+toggledChar);

        scanner.close();
    }   
}
