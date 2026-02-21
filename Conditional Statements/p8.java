import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String location = sc.next();
        int squareFootage = sc.nextInt();
        int age = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePricePerSqFt = 0;
        double ageAdjustment = 0;
        double amenityBonus = 0;

        
        if (location.equals("Prime")) {
            basePricePerSqFt = 400;
        } 
        else if (location.equals("Urban")) {
            basePricePerSqFt = 300;
        } 
        else if (location.equals("Suburban")) {
            basePricePerSqFt = 180;
        } 
        else {
            basePricePerSqFt = 100;  
        }

      
        if (age >= 0 && age <= 5) {
            ageAdjustment = 0;
        } 
        else if (age <= 10) {
            ageAdjustment = -5;
        } 
        else if (age <= 15) {
            ageAdjustment = -10;
        } 
        else if (age <= 30) {
            ageAdjustment = -15;
        } 
        else {
            ageAdjustment = -25;
        }

    
        double baseValue = squareFootage * basePricePerSqFt; 
        double adjustedValue = baseValue * (1 + ageAdjustment / 100);

      
        if (amenityScore >= 80) {
            amenityBonus = adjustedValue * 0.10;
        } 
        else if (amenityScore >= 60) {
            amenityBonus = adjustedValue * 0.05;
        } 
        else if (amenityScore >= 40) {
            amenityBonus = adjustedValue * 0.02;
        } 
        else {
            amenityBonus = 0;
        }

        double finalValue = adjustedValue + amenityBonus;

        
        String marketCategory;

        if ((location.equals("Prime") || location.equals("Urban")) && age < 15) {
            marketCategory = "Hot";
        } 
        else if (location.equals("Suburban")) {
            marketCategory = "Stable";
        } 
        else {
            marketCategory = "Slow";
        }

       
        System.out.println("Location Tier: " + location);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

        sc.close();
    }
}