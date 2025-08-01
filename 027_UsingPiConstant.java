import java.util.Scanner;

class UsingPiConstant 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of circle : ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle having radius "+radius+" = "+circumference);

        scanner.close();
    }    
}
