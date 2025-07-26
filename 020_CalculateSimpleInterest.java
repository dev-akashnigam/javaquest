import java.util.Scanner;

class CalculateSimpleInterest 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter principal amount : ");
        int principalAmt = scanner.nextInt();

        System.out.println("Please enter rate of interest : ");
        float rate = scanner.nextFloat();

        System.out.println("Please enter time duration : ");
        int timePeriod = scanner.nextInt();

        float simpleInterest = (principalAmt * rate * timePeriod)/100;

        System.out.println("Simple interest earned on investment of amount "+principalAmt+" at "+rate+"% for "+timePeriod+" years is : "+simpleInterest);

        scanner.close();
    }    
}