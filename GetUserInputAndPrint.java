
// Problem: 
// Read and Print a String

// Objective:
// Write a program that reads a string input from the user and prints the same string as output.

// Input:
// A single line containing a string S.
// The string may contain spaces.

// Output:
// Print the exact same string S as input.
// Note: The program should read an entire line (including spaces if any) and then output it exactly the same without any modification.

// Constraints:
// Length of the string 1 ≤ |S| ≤ 1000

import java.util.Scanner;

public class GetUserInputAndPrint 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();
    }   
}
