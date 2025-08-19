import java.util.Scanner;
class SwitchCase_GradeCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter marks (0-100): ");
        int myMarks = scanner.nextInt();

        int myMarksFirstDigit = myMarks / 10;

        char grade;

        switch(myMarksFirstDigit) {
            case 9, 10 -> {
                grade = 'A';
            }
            case 8 -> {
                grade = 'B';
            }
            case 7 -> {
                grade = 'C';
            }
            case 6 -> {
                grade = 'D';
            }
            default -> {
                grade = 'E';
            }
        }

        System.out.printf("Marks: %d correspond to grade = %c", myMarks, grade);
        scanner.close();
    }
    
}
