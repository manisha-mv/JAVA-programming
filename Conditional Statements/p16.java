import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine(); // consume newline
        String loyaltyTier = sc.nextLine();

        double baseRate = 0;
        double seasonalMultiplier = 1.0;
        int extendedDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrades = "None";

        // 1. Set base rate by room category
        if (roomCategory.equals("Standard")) {
            baseRate = 150.0;
        } else if (roomCategory.equals("Deluxe")) {
            baseRate = 300.0;
        } else if (roomCategory.equals("Suite")) {
            baseRate = 500.0;
        } else if (roomCategory.equals("Presidential")) {
            baseRate = 1000.0;
        }

        // 2. Apply seasonal multiplier
        if (season.equals("Off-Peak")) {
            seasonalMultiplier = 0.7;
        } else if (season.equals("Regular")) {
            seasonalMultiplier = 1.0;
        } else if (season.equals("Peak")) {
            seasonalMultiplier = 1.5;
        } else if (season.equals("Holiday")) {
            seasonalMultiplier = 2.0;
        }

        // 3. Extended stay discount
        if (nightsBooked >= 1 && nightsBooked <= 4) {
            extendedDiscount = 0;
        } else if (nightsBooked <= 7) {
            extendedDiscount = 5;
        } else if (nightsBooked <= 14) {
            extendedDiscount = 10;
        } else {
            extendedDiscount = 20;
        }

        // 4. Loyalty discount
        if (loyaltyTier.equals("None")) {
            loyaltyDiscount = 0;
        } else if (loyaltyTier.equals("Member")) {
            loyaltyDiscount = 10;
        } else if (loyaltyTier.equals("Gold")) {
            loyaltyDiscount = 15;
        } else if (loyaltyTier.equals("Platinum")) {
            loyaltyDiscount = 20;
        }

        // 5. Calculations
        double seasonalRate = baseRate * seasonalMultiplier;
        double nightlyRate = seasonalRate *
                (1 - extendedDiscount / 100.0) *
                (1 - loyaltyDiscount / 100.0);
        double totalCost = nightlyRate * nightsBooked;

        // 6. Assign upgrades
        if (loyaltyTier.equals("Platinum")) {
            upgrades = "Concierge service, airport transfer, and fine dining";
        } else if (loyaltyTier.equals("Gold")) {
            upgrades = "Free breakfast and spa access";
        } else if (loyaltyTier.equals("Member")) {
            upgrades = "Free breakfast";
        } else {
            upgrades = "None";
        }

        // Output
        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightlyRate);
        System.out.println("Total Booking Cost: $" + totalCost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();
    }
}
