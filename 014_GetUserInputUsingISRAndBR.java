import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class GetUserInputUsingISRAndBR 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your name : ");
        String name = in.readLine();

        System.out.println("Please enter your age in years : ");
        int age = Integer.parseInt(in.readLine());

        System.out.println("Please enter your weight in kgs : ");
        float weight = Float.parseFloat(in.readLine());

        System.out.println("Please enter your name initial : ");
        char ch = in.readLine().charAt(0);

        System.out.println("Welcome, Mr/Mrs. "+name);
        System.out.println(name+" is "+age+" years old!");
        System.out.println(name+" is "+weight+" kgs in weight!");
        System.out.println(name+" has "+ch+" as initials!");
    }
}
