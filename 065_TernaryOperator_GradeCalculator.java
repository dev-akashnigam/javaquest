/*
* This program dispels the misconception that ternary operators can only execute a single statement based on a condition's truth value.
* It demonstrates that, by invoking functions within the ternary operator, multiple lines of code can be executed depending on whether the condition evaluates to true or false.
*/

import java.util.Scanner;
class TernaryOperator_GradeCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter total marks obtained out of 100: ");
        double myTotalMarks = scanner.nextDouble();

        char grade = (myTotalMarks > 80) ? calcWhenMarksMoreThan80(myTotalMarks) : calcWhenMarksLessThanEqualTo80(myTotalMarks);

        System.out.println("Grade against marks: "+myTotalMarks+" = "+grade);

        scanner.close();
    }

    public static char calcWhenMarksMoreThan80(double marks) {
        if(marks>90) {
            return 'A';
        }
        else {
            return 'B';
        }
    }

    public static char calcWhenMarksLessThanEqualTo80(double marks) {
        if(marks>70) {
            return 'C';
        }
        else {
            return 'D';
        }
    }
}
