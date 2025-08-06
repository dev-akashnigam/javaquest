class NumberToTextConversion 
{
    public static void main(String args[])
    {
        int intNum = 7851;
        long longNum = 124126l;
        float floatNum = 12.265f;
        double doubleNum = 75.2365;

        String intString = String.valueOf(intNum);
        String longString = String.valueOf(longNum);
        String floatString = String.valueOf(floatNum);
        String doubleString = String.valueOf(doubleNum);

        System.out.println("String corresponding to the integer number : "+intNum+" = \""+intString+"\"");
        System.out.println("String corresponding to the long number : "+longNum+" = \""+longString+"\"");
        System.out.println("String corresponding to the float number : "+floatNum+" = \""+floatString+"\"");
        System.out.println("String corresponding to the double number : "+doubleNum+" = \""+doubleString+"\"");
    }   
}
