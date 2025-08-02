import java.util.Scanner;

class RoundingVsTruncatingVsFormatting 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number : ");
        final double decimalNo = scanner.nextDouble();

        System.out.println("Please enter the number of decimal places to round, truncate and format : ");
        final int noOfDecimalPlaces = scanner.nextInt();

        final double roundedDecimalNo = (Math.round(decimalNo * Math.pow(10, noOfDecimalPlaces)) / Math.pow(10, noOfDecimalPlaces));

        final double truncatedDecimalNo =  (int)(decimalNo * Math.pow(10, noOfDecimalPlaces)) / Math.pow(10, noOfDecimalPlaces);

        final String formattedDecimalNo = String.format("%."+noOfDecimalPlaces+"f", decimalNo);

        System.out.println("On rounding the decimal number: "+decimalNo+" to "+noOfDecimalPlaces+" decimal places, the number becomes = "+roundedDecimalNo);
        System.out.println("On truncating the decimal number: "+decimalNo+" to "+noOfDecimalPlaces+" decimal places, the number becomes = "+truncatedDecimalNo);
        System.out.println("On formatting the decimal number: "+decimalNo+" to "+noOfDecimalPlaces+" decimal places, the number becomes = "+formattedDecimalNo);

        scanner.close();
    }    
}

/*
Please enter a decimal number : 
12.5689974
Please enter the number of decimal places to round, truncate and format : 
2
On rounding the decimal number: 12.5689974 to 2 decimal places, the number becomes = 12.57
On truncating the decimal number: 12.5689974 to 2 decimal places, the number becomes = 12.56
On formatting the decimal number: 12.5689974 to 2 decimal places, the number becomes = 12.57
*/
