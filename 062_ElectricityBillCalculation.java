/*
Write a program that:
Takes input from the user for the number of electricity units consumed in a billing period.
Calculates the electricity bill amount based on the units consumed, using the following tariff slab rates:

Up to 100 units	 : 1.50
101 to 200 units : 2.00
201 to 300 units : 3.00
Above 300 units	 : 5.00

The cost calculation should apply the unit rates cumulatively across slabs. For example:

If the consumer uses 250 units:
- First 100 units charged at 1.50 per unit.
- Next 100 units (101 to 200) charged at 2.00 per unit.
- Remaining 50 units (201 to 250) charged at 3.00 per unit.
*/

import java.util.Scanner;

class ElectricityBillCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the units of electricity consumed: ");
        double myUnitsConsumed = scanner.nextDouble();

        double costOfConsumptionForFirst100Units = 0.0d;
        double costOfConsumptionForSecond100Units = 0.0d;
        double costOfConsumptionForThird100Units = 0.0d;
        double costOfConsumptionForMoreThan300Units = 0.0d;

        double costPerUnitForFirst100Units = 1.50;
        double costPerUnitForSecond100Units = 2.00;
        double costPerUnitForThird100Units = 3.00;
        double costPerUnitFor300PlusUnits = 5.00;

        if(myUnitsConsumed <= 100) {
            costOfConsumptionForFirst100Units = (100-myUnitsConsumed)*costPerUnitForFirst100Units;
        }
        else if(myUnitsConsumed <= 200) {
            costOfConsumptionForFirst100Units = 100 * costPerUnitForFirst100Units;
            costOfConsumptionForSecond100Units = (myUnitsConsumed-100) * costPerUnitForSecond100Units;
        }
        else if(myUnitsConsumed <= 300) {
            costOfConsumptionForFirst100Units = 100 * costPerUnitForFirst100Units;
            costOfConsumptionForSecond100Units = 100 * costPerUnitForSecond100Units;
            costOfConsumptionForThird100Units = (myUnitsConsumed-200) * costPerUnitForThird100Units;
        }
        else {
            costOfConsumptionForFirst100Units = 100 * costPerUnitForFirst100Units;
            costOfConsumptionForSecond100Units = 100 * costPerUnitForSecond100Units;
            costOfConsumptionForThird100Units = 100 * costPerUnitForThird100Units;
            costOfConsumptionForMoreThan300Units = (myUnitsConsumed - 300) * costPerUnitFor300PlusUnits;
        }

        double totalCostOfElectricityConsumed = costOfConsumptionForFirst100Units + costOfConsumptionForSecond100Units + costOfConsumptionForThird100Units + costOfConsumptionForMoreThan300Units;

        System.out.println("Total Bill: "+totalCostOfElectricityConsumed);

        scanner.close();
    }
}
