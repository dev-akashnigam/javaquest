import java.util.Scanner;
class NotOperator_InvalidAgeCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        final int myAge = scanner.nextInt();

        if( !(myAge>0 && myAge<=120) ) {
            System.out.println("Age: "+myAge+" is invalid!");
        }
        else {
            System.out.println("Age: "+myAge+" is valid!");
        }
        scanner.close();
    }   
}
