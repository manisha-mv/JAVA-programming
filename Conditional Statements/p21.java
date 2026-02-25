import java.util.Scanner;

public class p21
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int unitsConsumed = sc.nextInt();
        sc.nextLine(); 
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double tier1Rate = 0, tier2Rate = 0, tier3Rate = 0, tier4Rate = 0;
        double tier1Cost = 0, tier2Cost = 0, tier3Cost = 0, tier4Cost = 0;
        int seasonalAdjustment = 0;
        int paymentDiscount = 0;

        if (customerType.equals("Residential")) {
            tier1Rate = 0.10;
            tier2Rate = 0.15;
            tier3Rate = 0.25;
            tier4Rate = 0.30;
        } else if (customerType.equals("Commercial")) {
            tier1Rate = 0.12;
            tier2Rate = 0.18;
            tier3Rate = 0.25;
            tier4Rate = 0.25;
        } else if (customerType.equals("Industrial")) {
            tier1Rate = 0.08;
            tier2Rate = 0.12;
            tier3Rate = 0.20;
            tier4Rate = 0.20;
        }

        // 2. Calculate tier costs
        if (unitsConsumed > 0) {
            int tier1Units = Math.min(unitsConsumed, 100);
            tier1Cost = tier1Units * tier1Rate;
        }

        if (unitsConsumed > 100) {
            int tier2Units = Math.min(unitsConsumed - 100, 200);
            tier2Cost = tier2Units * tier2Rate;
        }

        if (unitsConsumed > 300) {
            int tier3Units = Math.min(unitsConsumed - 300, 200);
            tier3Cost = tier3Units * tier3Rate;
        }

        if (unitsConsumed > 500) {
            int tier4Units = unitsConsumed - 500;
            tier4Cost = tier4Units * tier4Rate;
        }

        double subtotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;

        // 3. Seasonal adjustment
        if (season.equals("Summer")) {
            seasonalAdjustment = 15;
        } else if (season.equals("Winter")) {
            seasonalAdjustment = -10;
        } else {
            seasonalAdjustment = 0;
        }

        double seasonalTotal = subtotal * (1 + seasonalAdjustment / 100.0);

        // 4. Payment discount
        if (paymentMethod.equals("Auto-Pay")) {
            paymentDiscount = 5;
        } else if (paymentMethod.equals("Online")) {
            paymentDiscount = 3;
        } else {
            paymentDiscount = 0;
        }

        double totalBill = seasonalTotal * (1 - paymentDiscount / 100.0);

        double averageRate = 0;
        if (unitsConsumed > 0) {
            averageRate = totalBill / unitsConsumed;
        }

        // Output
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" + tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" + tier4Cost);
        System.out.println("Seasonal Adjustment: " + seasonalAdjustment + "%");
        System.out.println("Payment Discount: " + paymentDiscount + "%");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", averageRate);

        sc.close();
    }
}