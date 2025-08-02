class TextToBooleanConversion 
{
    public static void main(String args[])
    {
        final String stringTrue = "true";
        final String stringFalse = "false";

        boolean booleanTrue = Boolean.parseBoolean(stringTrue);
        boolean booleanFalse = Boolean.parseBoolean(stringFalse);

        System.out.println("String : \""+stringTrue+"\" on conversion to boolean becomes = "+booleanTrue);
        System.out.println("String : \""+stringFalse+"\" on conversion to boolean becomes = "+booleanFalse);
    }    
}
