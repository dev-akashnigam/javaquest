import java.util.Scanner;

class CheckLeapYear {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year : ");
        int myYear = scanner.nextInt();

        if(myYear%100 == 0) { // check if the year is a century year.
            if(myYear%400 == 0) { // if the year is a century year, check if the year is divisible by 400.
                System.out.println("Year: "+myYear+" is a leap year!");
            }
            else {
                System.out.println("Year: "+myYear+" is NOT a leap year!");
            }
        }
        else { // year is a non-century year.
            if(myYear%4 == 0) { // check if the non-century year is divisible by 4.
                System.out.println("Year: "+myYear+" is a leap year!");
            }
            else {
                System.out.println("Year: "+myYear+" is not a leap year!");
            }
        }
        scanner.close();
    }    
}
