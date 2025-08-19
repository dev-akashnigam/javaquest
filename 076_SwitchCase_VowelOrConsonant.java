import java.util.Scanner;

class SwitchCase_VowelOrConsonant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an alphabet: ");
        char myAlphabet = scanner.next().charAt(0);

        char myAlphabetLowerCase = Character.toLowerCase(myAlphabet);

        switch(myAlphabetLowerCase) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.printf("Alphabet %c is a vowel.", myAlphabet);
            }
            default -> {
                System.out.printf("Alphabet: %c is a consonant.", myAlphabet);
            }
        }

        scanner.close();
    }  
}
