import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int driverAge = sc.nextInt();
        String vehicleType = sc.next();
        String drivingRecord = sc.next();
        String coverageLevel = sc.next();

        double basePremium = 0;
        double ageFactor = 0;
        double vehicleFactor = 0;
        int recordAdjustment = 0;

        if (coverageLevel.equals("Basic")) {
            basePremium = 500;
        } 
        else if (coverageLevel.equals("Standard")) {
            basePremium = 800;
        } 
        else {
            basePremium = 1500;  
        }

        if (driverAge >= 16 && driverAge <= 21) {
            ageFactor = 1.8;
        } 
        else if (driverAge <= 25) {
            ageFactor = 1.5;
        } 
        else if (driverAge <= 40) {
            ageFactor = 1.0;
        } 
        else if (driverAge <= 60) {
            ageFactor = 0.9;
        } 
        else {
            ageFactor = 1.1;
        }

        
        if (vehicleType.equals("Sedan")) {
            vehicleFactor = 1.0;
        } 
        else if (vehicleType.equals("SUV")) {
            vehicleFactor = 1.2;
        } 
        else if (vehicleType.equals("Sports")) {
            vehicleFactor = 1.5;
        } 
        else {
            vehicleFactor = 1.1;  
        }

     
        if (drivingRecord.equals("Clean")) {
            recordAdjustment = -10;
        } 
        else if (drivingRecord.equals("Minor-Violations")) {
            recordAdjustment = 25;
        } 
        else {
            recordAdjustment = 50; 
        }

        
        double annualPremium = basePremium * ageFactor * vehicleFactor;
        annualPremium = annualPremium * (1 + recordAdjustment / 100.0);

        double monthlyPremium = annualPremium / 12;

      
        String riskCategory;

        if ((driverAge <= 21 && vehicleType.equals("Sports")) 
                || drivingRecord.equals("Major-Violations")) {
            riskCategory = "Very High";
        } 
        else if (drivingRecord.equals("Major-Violations")) {
            riskCategory = "High";
        } 
        else if (drivingRecord.equals("Minor-Violations")) {
            riskCategory = "Medium";
        } 
        else {
            riskCategory = "Low";
        }

       
        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleFactor + "x");
        System.out.println("Record Adjustment: " + recordAdjustment + "%");
        System.out.printf("Monthly Premium: $%.2f\n", monthlyPremium);
        System.out.println("Annual Premium: $" + annualPremium);
        System.out.println("Risk Category: " + riskCategory);

        sc.close();
    }

}
