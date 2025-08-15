import java.util.Scanner;
class ConsolePrintingUsingPrintf {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter patients name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter patients age: ");
        int age = scanner.nextInt();

        System.out.println("Please enter patients weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter patients gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.println("Was person in senses at the time of admission (true/false): ");
        boolean wasInSenses = scanner.nextBoolean();

        System.out.printf("Patient: %s (%c) having age: %d and weight: %.1f was in senses: %b at the time of admission.%n", name, gender, age, weight, wasInSenses);

        scanner.close();
    }
}
