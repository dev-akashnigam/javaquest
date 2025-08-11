import java.util.Scanner;

class AlphabetDigitOrSpecialCharacter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        int asciiValueMyChar = (int)myChar;

        if( (asciiValueMyChar>=65 && asciiValueMyChar<=90) || (asciiValueMyChar>=97 && asciiValueMyChar<=122) ) {
            System.out.println("Character: "+myChar+" is an alphabet.");
        }
        else if(asciiValueMyChar>=48 && asciiValueMyChar<=57) {
            System.out.println("Character: "+myChar+" is a digit.");
        }
        else {
            System.out.println("Character: "+myChar+" is a special character.");
        }

        scanner.close();
    } 
}
