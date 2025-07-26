import java.util.Scanner;

class ConvertCelciusToFahrenheit
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature in Celcuis : ");
        float celciusTemp = scanner.nextFloat();

        float fahrenheitTemp = ((celciusTemp *9)/5)+32;
        System.out.println(celciusTemp+" degree celcius = "+fahrenheitTemp+" degree fahrenheit");

        scanner.close();
    }
}
