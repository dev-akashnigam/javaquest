class NumberToTextConversion 
{
    public static void main(String args[])
    {
        final int intNum = 7851;
        final long longNum = 124126l;
        final float floatNum = 12.265f;
        final double doubleNum = 75.2365;

        final String intString = String.valueOf(intNum);
        final String longString = String.valueOf(longNum);
        final String floatString = String.valueOf(floatNum);
        final String doubleString = String.valueOf(doubleNum);

        System.out.println("String corresponding to the integer number : "+intNum+" = \""+intString+"\"");
        System.out.println("String corresponding to the long number : "+longNum+" = \""+longString+"\"");
        System.out.println("String corresponding to the float number : "+floatNum+" = \""+floatString+"\"");
        System.out.println("String corresponding to the double number : "+doubleNum+" = \""+doubleString+"\"");
    }   
}
