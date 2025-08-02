import java.util.Scanner;

class RoundingDecimalNumbers 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number that you want to round : ");
        float decimalNo = scanner.nextFloat();

        int roundedToNearestInteger = Math.round(decimalNo);
        double roundedToOneDecimalPlace = (Math.round(decimalNo * 10)) / 10.0;
        double roundedToTwoDecimalPlace = (Math.round(decimalNo * 100)) / 100.0;
        double roundedToThreeDecimalPlace = (Math.round(decimalNo * 1000)) / 1000.0;

        System.out.println(decimalNo+" when rounded off to nearest integer becomes : "+roundedToNearestInteger);
        System.out.println(decimalNo+" when rounded off to nearest integer becomes : "+roundedToOneDecimalPlace);
        System.out.println(decimalNo+" when rounded off to two decimal places becomes : "+roundedToTwoDecimalPlace);
        System.out.println(decimalNo+" when rounded off to three decimal places becomes : "+roundedToThreeDecimalPlace);

        scanner.close();
    }    
}
