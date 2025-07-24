import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadBooleanInputAndPrint 
{
    public static void main(String args[]) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Do you know french language (true/false) : ");
        boolean knowFrenchLanguage = scanner.nextBoolean();

        System.out.println("Do you know english language (true/false) : ");
        boolean knowEnglishLanguage = Boolean.parseBoolean(in.readLine());

        System.out.println("You know french language : "+knowFrenchLanguage);
        System.out.println("You know english language : "+knowEnglishLanguage);
        
        scanner.close();
    }    
}
