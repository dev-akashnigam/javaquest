/*
 * Floor division operator does not exist in JS. 
 * Alternately, the same can be achieved using Math.floor() method.
 */

 class DivisionVsFloorDivisionOperatorPlaceholder {
    public static void main(String args[]) {
        double dividend = 7;
        double divisor = 2;

        double divisionResult = dividend/divisor;
        double floorDivisionResult = Math.floor(dividend/divisor);

        System.out.println(dividend+ " divided by "+divisor+" = "+divisionResult);
        System.out.println(dividend+ " floor divided by "+divisor+" = "+floorDivisionResult);
    }
 }
