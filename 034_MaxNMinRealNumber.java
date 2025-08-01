class MaxNMinRealNumber 
{
    public static void main(String args[])
    {
        final long maxRealNo = Long.MAX_VALUE;
        final long minRealNo = -Long.MAX_VALUE-1;  // -Long.MAX_VALUE-1; = Long.MIN_VALUE

        System.out.println("Max real number supported by Java = "+maxRealNo);
        System.out.println("Min real number supported by Java = "+minRealNo);
    }    
}
