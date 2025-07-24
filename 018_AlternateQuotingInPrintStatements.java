class AlternateQuotingInPrintStatements 
{
    public static void main(String args[])
    {
        System.out.println("It's a beautiful day!"); // this is a valid statement.

        /*
         * JAVA also supports alternate quoating like Python and JS but
         * in JAVA print statements cannot start with single quote.
         * Therefore,
         * To use double quotes within print statements, 
         * escape character corresponding to double quotes which is \" should be used.
         * See below.
         */

         // System.out.println("He said "Hello" "); // this is not a valid statement. you cannot enclose double quotes inside double quotes.

         System.out.println("He said \"Hello\" ");  // this is a valid statement.

    }    
}
