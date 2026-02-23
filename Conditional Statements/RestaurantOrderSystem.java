import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine(); 
        String timeSlot = sc.nextLine();

        int baseDiscount = 0;
        int timeAdjustment = 0;
        double serviceFee = 0;
        String kitchenPriority = "";
        int prepTime = 0;

       
        if (loyaltyStatus.equals("Gold")) {
            baseDiscount = 15;
        } 
        else if (loyaltyStatus.equals("Silver")) {
            baseDiscount = 10;
        } 
        else if (loyaltyStatus.equals("Bronze")) {
            baseDiscount = 5;
        } 
        else {
            baseDiscount = 0;
        }

       
        if (timeSlot.equals("Late-Night")) {
            timeAdjustment = -5;   
        } 
        else {
            timeAdjustment = 0;
        }

        int totalDiscount = baseDiscount - timeAdjustment;

      
        if (orderType.equals("Delivery")) {
            serviceFee = orderValue * 0.10;
        } 
        else if (orderType.equals("Takeout")) {
            serviceFee = orderValue * 0.03;
        } 
        else {  
            serviceFee = 0;
        }

       
        double discountedValue = orderValue * (1 - (totalDiscount / 100.0));
        double finalAmount = discountedValue + serviceFee;

        if (timeSlot.equals("Peak")) {
            if (orderType.equals("Delivery")) {
                kitchenPriority = "High";
            } else {
                kitchenPriority = "Medium";
            }
        } 
        else if (timeSlot.equals("Regular")) {
            kitchenPriority = "Medium";
        } 
        else { 
            kitchenPriority = "Low";
        }

        
        if (kitchenPriority.equals("High")) {
            if (orderType.equals("Delivery"))
                prepTime = 25;
            else
                prepTime = 30;
        } 
        else if (kitchenPriority.equals("Medium")) {
            if (orderType.equals("Dine-In"))
                prepTime = 20;
            else
                prepTime = 25;
        } 
        else { 
            prepTime = 15;
        }

       
        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + kitchenPriority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}