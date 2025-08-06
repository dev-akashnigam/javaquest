class BooleanToNumberConversion 
{
    public static void main(String args[])
    {
        final boolean boolInput = false; // You can alter between true and false here and see the corresponding number that gets printed in the output.

        /*
         * There is no direct way to convert boolean value to number in java.
         * Doing it manually as below
        */

        int numForBooleanValue = 0;
        if(boolInput)
        {
            numForBooleanValue = 1;
        }

        System.out.println("Number corresponding to the boolean value: "+boolInput+" = "+numForBooleanValue);
    }    
}
