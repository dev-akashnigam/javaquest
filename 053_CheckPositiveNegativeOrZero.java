import java.util.Scanner;

class CheckPositiveNegativeOrZero {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("Number: "+num+" is greater than 0.");
        }
        else if(num == 0) {
            System.out.println("Number: "+num+" is equal to 0.");
        }
        else {
            System.out.println("Number: "+num+" is less than 0.");
        }

        scanner.close();
    }    
}
