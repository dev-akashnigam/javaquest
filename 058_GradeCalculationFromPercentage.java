import java.util.Scanner;

class GradeCalculationFromPercentage {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the marks obtained in first subject: ");
        double marksSubject1 = scanner.nextDouble();

        System.out.println("Please enter the marks obtained in second subject: ");
        double marksSubject2 = scanner.nextDouble();

        System.out.println("Please enter the marks obtained in third subject: ");
        double marksSubject3 = scanner.nextDouble();

        System.out.println("Please enter the marks obtained in forth subject: ");
        double marksSubject4 = scanner.nextDouble();

        System.out.println("Please enter the marks obtained in fifth subject: ");
        double marksSubject5 = scanner.nextDouble();

        double percentage = ((marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4 + marksSubject5)/500) * 100;

        char grade;

        if(percentage >= 90) {
            grade = 'A';
        }
        else if (percentage>=80 && percentage<90) {
            grade = 'B';
        }
        else if (percentage>=70 && percentage<80) {
            grade = 'C';
        }
        else if (percentage>=60 && percentage<70) {
            grade = 'D';
        }
        else if (percentage>=40 && percentage<60) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }

        System.out.println("Grade for percentage: "+percentage+" = "+grade);
        scanner.close();
    } 
}
