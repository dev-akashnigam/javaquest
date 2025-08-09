import java.util.Scanner;

class CheckEvenOrOdd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a real number : ");
        int myNum = scanner.nextInt();

        if(myNum%2 == 0) {
            System.out.println("Even number!");
        }
        else {
            System.out.println("Odd number!");
        }
        scanner.close();
    }    
}
