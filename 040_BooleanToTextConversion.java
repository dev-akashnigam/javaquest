class BooleanToTextConversion 
{
    public static void main(String args[])
    {
        boolean boolTrue = true;
        boolean boolFalse = false;

        String boolTrueString = String.valueOf(boolTrue);
        String boolFalseString = String.valueOf(boolFalse);

        System.out.println("String corresponding to the boolean value "+boolTrue+" = \""+boolTrueString+"\"");
        System.out.println("String corresponding to the boolean value "+boolFalse+" = \""+boolFalseString+"\"");
    }    
}
