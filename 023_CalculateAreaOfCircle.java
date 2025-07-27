import java.util.Scanner;

class CalculateAreaOfCircle 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius of circle : ");
        double radius = scanner.nextDouble();

        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle whose radius is "+radius+" = "+areaOfCircle);

        scanner.close();
    }
    
}
