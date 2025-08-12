/*
Objective:
Write a program that takes marks for five subjects, computes the total and percentage, and assigns a grade based on a defined percentage–grade 
mapping using an if-else ladder.

Input:
Prompt the user to enter marks obtained in five different subjects (e.g., Math, English, Science, Social Studies, Computer).
You may assume each subject is out of 100 marks.
Data type can be int or float depending on whether marks can have decimals.

Grade Assignment:
90% and above:	A
80% to <90%  :	B
70% to <80%  :	C
60% to <70%	 :  D
40% to <60%	 :  E
Below 40%	 :  F
*/

import java.util.Scanner;

class GrossSalaryCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter basic salary: ");
        double myBasicSalary = scanner.nextDouble();

        double houseRentAllowanceAmount;
        double dearnessAllowanceAmount;

        int houseRentAllowancePercentage;
        int dearnessAllowancePercentage;

        if(myBasicSalary<=10000) {
            houseRentAllowancePercentage = 20;
            dearnessAllowancePercentage = 80;
        }
        else if(myBasicSalary>10000 && myBasicSalary<=20000) {
            houseRentAllowancePercentage = 25;
            dearnessAllowancePercentage = 90;
        }
        else {
            houseRentAllowancePercentage = 30;
            dearnessAllowancePercentage = 95;
        }

        houseRentAllowanceAmount = myBasicSalary * (houseRentAllowancePercentage/100.0);
        dearnessAllowanceAmount = myBasicSalary * (dearnessAllowancePercentage/100.0);

        double grossSalary = myBasicSalary + houseRentAllowanceAmount + dearnessAllowanceAmount;

        System.out.println("Basic Salary: "+myBasicSalary);
        System.out.println("HRA ("+houseRentAllowancePercentage+"%): "+houseRentAllowanceAmount);
        System.out.println("DA ("+dearnessAllowancePercentage+"%): "+dearnessAllowanceAmount);
        System.out.println("Gross Salary: "+grossSalary);

        scanner.close();
    }    
}
