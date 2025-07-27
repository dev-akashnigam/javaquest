import java.util.Scanner;

class CalculateAreaOfRectangle 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length : ");
        double length = scanner.nextDouble();

        System.out.println("Please enter breadth : ");
        double breadth = scanner.nextDouble();

        double areaOfRectangle = length * breadth;
        System.out.println("Area of rectangle having length "+length+" and breadth "+breadth+" = "+areaOfRectangle);

        scanner.close();
    }    
}
