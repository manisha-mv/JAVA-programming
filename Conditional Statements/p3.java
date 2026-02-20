import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String smokingStatus = sc.next();
        String preExisting = sc.next();
        String coverageTier = sc.next();

        double basePremium = 0.0;
        double riskSurcharge = 0.0;
        double totalPremium = 0.0;

        

        if (coverageTier.equals("Basic")) {

            if (age >= 18 && age <= 30)
                basePremium = 200;
            else if (age <= 50)
                basePremium = 250;
            else if (age <= 65)
                basePremium = 350;
            else
                basePremium = 400;

        } 
        else if (coverageTier.equals("Standard")) {

            if (age >= 18 && age <= 30)
                basePremium = 300;
            else if (age <= 50)
                basePremium = 350;
            else if (age <= 65)
                basePremium = 450;
            else
                basePremium = 550;

        } 
        else { 

            if (age >= 18 && age <= 30)
                basePremium = 500;
            else if (age <= 50)
                basePremium = 600;
            else if (age <= 65)
                basePremium = 700;
            else
                basePremium = 800;
        }

        

        if (smokingStatus.equals("Smoker") && preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.70;   
        } 
        else if (smokingStatus.equals("Smoker")) {
            riskSurcharge = basePremium * 0.40;   
        } 
        else if (preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.30;   
        } 
        else {
            riskSurcharge = 0.0;
        }

        totalPremium = basePremium + riskSurcharge;

        
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.printf("Base Premium: $%.1f\n", basePremium);
        System.out.printf("Risk Surcharge: $%.1f\n", riskSurcharge);
        System.out.printf("Total Monthly Premium: $%.1f\n", totalPremium);

        sc.close();
    }
}