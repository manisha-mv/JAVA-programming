import java.util.Scanner;

public class p4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loyaltyTier = sc.next();
        double cartValue = sc.nextDouble();
        String productCategory = sc.next();
        String membershipStatus = sc.next();

        int baseDiscount = 0;
        int additionalDiscount = 0;
        int totalDiscount = 0;


        if (loyaltyTier.equals("Bronze"))
            baseDiscount = 5;
        else if (loyaltyTier.equals("Silver"))
            baseDiscount = 8;
        else if (loyaltyTier.equals("Gold"))
            baseDiscount = 12;
        else
            baseDiscount = 15;   


       
        if (cartValue >= 500 && cartValue <= 999)
            additionalDiscount += 3;
        else if (cartValue >= 1000 && cartValue <= 1999)
            additionalDiscount += 5;
        else if (cartValue >= 2000)
            additionalDiscount += 7;


      

        if (productCategory.equals("Electronics")) {

            if (membershipStatus.equals("Prime"))
                additionalDiscount += 5;

        }
        else if (productCategory.equals("Fashion")) {

            additionalDiscount += 3;

        }
        else if (productCategory.equals("Books")) {

            if (membershipStatus.equals("Prime"))
                additionalDiscount += 5;

        }
        else if (productCategory.equals("Groceries")) {

            if (cartValue > 300)
                additionalDiscount += 2;
        }

       

        totalDiscount = baseDiscount + additionalDiscount;

        double finalPrice = cartValue * (1 - totalDiscount / 100.0);
        double savings = cartValue - finalPrice;

        
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.printf("Cart Value: $%.1f\n", cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.printf("Final Price: $%.1f\n", finalPrice);
        System.out.printf("Savings: $%.1f\n", savings);

        sc.close();
    }
}
