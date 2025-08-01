class DecimalNumberPrecision
{
    public static void main(String args[])
    {
        float numF = 1.12345678987654321f;  // 17 digits after decimal point.
        double numD = 1.12345678987654321;  // 17 digits after decimal point.

        System.out.println("Number stored with float datatype = "+ numF);  // O/P = 1.1234568 i.e float only supports 7 digits after decimal.
        System.out.println("Number stored with double datatype = "+ numD); // O/P = 1.1234567898765433 i.e double supports 16 digits after the decimal point.
    }    
}
