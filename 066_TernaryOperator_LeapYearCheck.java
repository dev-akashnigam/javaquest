/*
 * This program illustrates the technique of nesting multiple ternary operators, starting from a single base ternary operator, 
 * to handle progressively complex conditional logic.
 */

import java.util.Scanner;
class TernaryOperator_LeapYearCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the year: ");
        int myYear = scanner.nextInt();

        boolean isLeapYear = (myYear%100 == 0) ? ( (myYear%400 == 0) ? true : false ) : (myYear%4 == 0 ? true : false); 
        // If the year is a century year (base condition), then I want to check another condition (which can be done using another ternary operator (nested)) that if the year is divisible by 400. 
        // If the year is not century year, then also I want to check another condition (which can be done using another ternary operator (nested)) that if the year is divisible by 4.

        System.out.println("Year: "+myYear+" is a leap year = "+isLeapYear);

        scanner.close();
    }
}
