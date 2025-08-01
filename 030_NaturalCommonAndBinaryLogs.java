import java.util.Scanner;

class NaturalCommonAndBinaryLogs 
{
    public static void main(String args[])
    {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for which you want to calculate logarithms : ");
        final double number = scanner.nextDouble();
        
        final double naturalLogofNum = Math.log(number);
        final double commonLogOfNum = Math.log10(number);
        
        // final double binaryLog = Math.log2(num); 
        // Math.log2() method is not available in Java while its there in JS and PY.
        final double naturalLogOf2 = Math.log(2);
        final double binaryLogOfNum = naturalLogofNum/naturalLogOf2;

        System.out.println("Natural log (log base e) of number: "+number+" = "+naturalLogofNum);
        System.out.println("Common log (log base 10) of number: "+number+" = "+commonLogOfNum);
        System.out.println("Binary log (log base 2) of number: "+number+" = "+binaryLogOfNum);

        scanner.close();
    }    
}
