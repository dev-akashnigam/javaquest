import java.util.Scanner;

class SwitchCase_DayNameFromDayNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the day number (1-7): ");
        int myDayNo = scanner.nextInt();

        String dayName;

        switch(myDayNo) {
            case 1 -> {
                dayName = "MONDAY";
            }
            case 2 -> {
                dayName = "TUESDAY";
            }
            case 3 -> {
                dayName = "WEDNESDAY";
            }
            case 4 -> {
                dayName = "THURSDAY";
            }
            case 5 -> {
                dayName = "FRIDAY";
            }
            case 6 -> {
                dayName = "SATURDAY";
            }
            case 7 -> {
                dayName = "SUNDAY";
            }
            default -> {
                dayName = "UNDEFINED";
            }
        }

        System.out.printf("Day %d represents = %s", myDayNo, dayName);

        scanner.close();
    }
}
