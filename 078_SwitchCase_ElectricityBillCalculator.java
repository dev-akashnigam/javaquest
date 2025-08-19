import java.util.Scanner;
class SwitchCase_ElectricityBillCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of units consumed: ");
        int myUnitsConsumed = scanner.nextInt();

        int myUnitsConsumedFactor100 = myUnitsConsumed / 100;

        double ratePerUnit1st100Units = 3.0;
        double ratePerUnit2nd100Units = 4.5;
        double ratePerUnit3rd100Units = 6.0;
        double ratePerUnit4th100Units = 7.5;
        double totalCostOfElectricityConsumption;

        switch(myUnitsConsumedFactor100) {
            case 0 -> {
                totalCostOfElectricityConsumption = myUnitsConsumed * ratePerUnit1st100Units;
            }
            case 1 -> {
                totalCostOfElectricityConsumption = (100 * ratePerUnit1st100Units) + 
                                                    ((myUnitsConsumed - 100) * ratePerUnit2nd100Units);
            }
            case 2 -> {
                totalCostOfElectricityConsumption = (100 * ratePerUnit1st100Units) + 
                                                    (100 * ratePerUnit2nd100Units) + 
                                                    ((myUnitsConsumed - 200) * ratePerUnit3rd100Units);
            }
            default -> {
                totalCostOfElectricityConsumption = (100 * ratePerUnit1st100Units) + 
                                                    (100 * ratePerUnit2nd100Units) +
                                                    (100 * ratePerUnit3rd100Units) +
                                                    ((myUnitsConsumed - 300) * ratePerUnit4th100Units);
            }
        }

        System.out.printf("Total Bill: %f", totalCostOfElectricityConsumption);
        scanner.close();
    }
}
