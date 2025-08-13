import java.util.Scanner;
class NotOperator_NumberNotPositiveCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive or negative real number: ");
        int myNum = scanner.nextInt();

        if(!(myNum>=0)) {
            System.out.println(myNum+" is negative!");
        }
        else {
            System.out.println(myNum+" is positive!");
        }

        scanner.close();
    }
}
