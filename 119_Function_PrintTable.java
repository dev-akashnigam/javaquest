import java.util.Scanner;
class Function_PrintTable {

    public static void printTable(int num) {
        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num*i);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int myNum = scanner.nextInt();

        printTable(myNum);

        scanner.close();
    }
}
