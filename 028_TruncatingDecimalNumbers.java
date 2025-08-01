import java.util.Scanner;

class TruncatingDecimalNumbers 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number that you want to truncate : ");
        double decimalNo = scanner.nextDouble();

        int truncatedto0DecimalPlace = (int)(decimalNo);
        double truncatedto1DecimalPlace = ((int)(decimalNo*10))/10.0;
        double truncatedto2DecimalPlace = ((int)(decimalNo*100))/100.0;
        double truncatedto3DecimalPlace = ((int)(decimalNo*1000))/1000.0;

        System.out.println("Truncating "+decimalNo+" to 0 decimal places results in = "+truncatedto0DecimalPlace);
        System.out.println("Truncating "+decimalNo+" to 1 decimal places results in = "+truncatedto1DecimalPlace);
        System.out.println("Truncating "+decimalNo+" to 2 decimal places results in = "+truncatedto2DecimalPlace);
        System.out.println("Truncating "+decimalNo+" to 3 decimal places results in = "+truncatedto3DecimalPlace);

        scanner.close();
    }    
}
