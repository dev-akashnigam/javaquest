import java.util.Scanner;

class UsingEulersConstant 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter principal amount : ");
        double principal = scanner.nextDouble();

        System.out.println("Please enter rate of interest (in decimals not percentage) : ");
        double rate = scanner.nextDouble();

        System.out.println("Please enter time in years : ");
        double time = scanner.nextDouble();

        double continuousCompoundInterest = principal * Math.pow(Math.E, rate*time);

        System.out.println("Final amount recieved on investment of amount: "+principal+" for "+time+" years at "+rate+" rate of interest = "+continuousCompoundInterest);

        scanner.close();
    }
}
