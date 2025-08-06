class NumberToNumberConversion 
{
    public static void main(String args[])
    {
        int intNum = 100;
        long longNum = 200L;

        float floatNum = 300.56f;
        double doubleNum = 400.987;

        // int -> long, float, double
        long longConvertedFromInt = (long)intNum;  // widening conversion, casting is optional
        float floatConvertedFromInt = (float)intNum; // widening conversion, casting is optional
        double doubleConvertedFromInt = (double)intNum; // widening conversion, casting is optional

        System.out.println("integer: "+intNum+" converted to long becomes = "+longConvertedFromInt);
        System.out.println("integer: "+intNum+" converted to float becomes = "+floatConvertedFromInt);
        System.out.println("integer: "+intNum+" converted to double becomes = "+doubleConvertedFromInt);

        // long -> int, float, double
        int intConvertedFromLong = (int)longNum;  // narrowing conversion, casting is mandatory
        float floatConvertedFromLong = (float)longNum; // widening conversion, casting is optional
        double doubleConvertedFromLong = (double)longNum; // widening conversion, casting is optional

        System.out.println("long: "+longNum+" converted to int becomes = "+intConvertedFromLong);
        System.out.println("long: "+longNum+" converted to float becomes = "+floatConvertedFromLong);
        System.out.println("long: "+longNum+" converted to double becomes = "+doubleConvertedFromLong);

        // float -> int, long, double
        int intConvertedFromFloat = (int)floatNum; // narrowing conversion, casting is mandatory
        long longConvertedFromFloat = (long)floatNum; // narrowing conversion, casting is mandatory
        double doubleConvertedFromFloat = (double)floatNum; // widening conversion, casting is optional

        System.out.println("float: "+floatNum+" converted to int becomes = "+intConvertedFromFloat);
        System.out.println("float: "+floatNum+" converted to long becomes = "+longConvertedFromFloat);
        System.out.println("float: "+floatNum+" converted to double becomes = "+doubleConvertedFromFloat);

        // double -> int, long, float
        int intConvertedFromDouble = (int)doubleNum; // narrowing conversion, casting is mandatory
        long longConvertedFromDouble = (long)doubleNum; // narrowing conversion, casting is mandatory
        float floatConvertedFromDouble = (float)doubleNum; // narrowing conversion, casting is mandatory

        System.out.println("double: "+doubleNum+" converted to int becomes = "+intConvertedFromDouble);
        System.out.println("double: "+doubleNum+" converted to long becomes = "+longConvertedFromDouble);
        System.out.println("double: "+doubleNum+" converted to float becomes = "+floatConvertedFromDouble);    
    }    
}
