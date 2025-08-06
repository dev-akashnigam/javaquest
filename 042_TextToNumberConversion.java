/*
 * For converting Text/String to Number, we use parse method() of the wrapper classes 
 * corresponding to the primitive type
 * we want to cast to.
 */

class TextToNumberConversion 
{
    public static void main(String args[])
    {
        String realNum = "42";
        String decimalNum = "100.8963";

        int integerNum = Integer.parseInt(realNum);
        long longNum = Long.parseLong(realNum);

        float floatNum = Float.parseFloat(decimalNum);
        double doubleNum = Double.parseDouble(decimalNum);

        System.out.println("Integer corresponding to Text/String : \""+realNum+"\" = "+integerNum);
        System.out.println("Long corresponding to Text/String : \""+realNum+"\" = "+longNum);

        System.out.println("Float corresponding to Text/String : \""+decimalNum+"\" = "+floatNum);
        System.out.println("Double corresponding to Text/String : \""+decimalNum+"\" = "+doubleNum);
    }    
}

/*
Integer corresponding to Text/String : "42" = 42
Long corresponding to Text/String : "42" = 42
Float corresponding to Text/String : "100.8963" = 100.8963
Double corresponding to Text/String : "100.8963" = 100.8963
 */


