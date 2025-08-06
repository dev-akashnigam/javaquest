class BooleanToTextConversion 
{
    public static void main(String args[])
    {
        final boolean boolTrue = true;
        final boolean boolFalse = false;

        final String boolTrueString = String.valueOf(boolTrue);
        final String boolFalseString = String.valueOf(boolFalse);

        System.out.println("String corresponding to the boolean value "+boolTrue+" = \""+boolTrueString+"\"");
        System.out.println("String corresponding to the boolean value "+boolFalse+" = \""+boolFalseString+"\"");
    }    
}
