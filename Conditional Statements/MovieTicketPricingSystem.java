import java.util.Scanner;

public class MovieTicketPricingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();

        double basePrice = 12.0;
        double formatSurcharge = 0;
        double seatUpgrade = 0;
        int timeAdjustment = 0;
        int customerDiscount = 0;
        String concessionVoucher = "No";
        String pricingCategory = "";

        // 1. Format surcharge
        if (movieFormat.equals("2D")) {
            formatSurcharge = 0.0;
        } else if (movieFormat.equals("3D")) {
            formatSurcharge = 5.0;
        } else if (movieFormat.equals("IMAX")) {
            formatSurcharge = 8.0;
        } else if (movieFormat.equals("4DX")) {
            formatSurcharge = 10.0;
        }

        // 2. Seat upgrade fee
        if (seatCategory.equals("Standard")) {
            seatUpgrade = 0.0;
        } else if (seatCategory.equals("Premium")) {
            seatUpgrade = 4.0;
        } else if (seatCategory.equals("Recliner")) {
            seatUpgrade = 7.0;
        }

        // 3. Time-based adjustment
        if (showTime.equals("Matinee")) {
            timeAdjustment = -30;
        } else if (showTime.equals("Evening")) {
            timeAdjustment = 0;
        } else if (showTime.equals("Prime-Time")) {
            timeAdjustment = 20;
        } else if (showTime.equals("Late-Night")) {
            timeAdjustment = -20;
        }

        // 4. Customer discount
        if (customerType.equals("Adult")) {
            customerDiscount = 0;
        } else if (customerType.equals("Senior")) {
            customerDiscount = 25;
        } else if (customerType.equals("Student")) {
            customerDiscount = 15;
        } else if (customerType.equals("Child")) {
            customerDiscount = 30;
        }

        // 5. Calculations
        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);

        // 6. Concession Voucher
        if (showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
            concessionVoucher = "Yes";
        }

        // 7. Pricing Category based on final price
        if (finalPrice < 10) {
            pricingCategory = "Value";
        } else if (finalPrice <= 25) {
            pricingCategory = "Standard";
        } else if (finalPrice <= 30) {
            pricingCategory = "Premium";
        } else {
            pricingCategory = "Luxury";
        }

        // Output
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Concession Voucher: " + concessionVoucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}
