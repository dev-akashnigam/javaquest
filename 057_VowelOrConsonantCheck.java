import java.util.Scanner;

class VowelOrConsonantCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char myChar = scanner.next().charAt(0);

        if(myChar == 'A' || myChar == 'a' || myChar == 'E' || myChar == 'e' || myChar == 'I' || myChar == 'i' || myChar == 'O' || myChar == 'o' || myChar == 'U' || myChar == 'u') {
            System.out.println("Character: "+myChar+" is a vowel.");
        }
        else {
            System.out.println("Character: "+myChar+" is a consonant.");
        }

        scanner.close();
    }
}
