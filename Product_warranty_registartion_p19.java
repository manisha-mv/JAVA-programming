import java.util.Scanner;

public class Product_warranty_registartion_p19 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int active = 0;
        int expiring = 0;
        int expired = 0;

        for(int i = 1; i <= n; i++){

            String pr_ID = sc.next();
            String pr_type = sc.next();
            int month_purchase = sc.nextInt();

            int warranty_period = 0;

            if(pr_type.equals("Electronics")){
                warranty_period = 12;
            }
            else if(pr_type.equals("Appliance")){
                warranty_period = 24;
            }
            else if(pr_type.equals("Computer")){
                warranty_period = 36;
            }

            int remaining = warranty_period - month_purchase;

            if(remaining < 0){
                remaining = 0;
            }

            String status = "";

            if(remaining == 0){
                status = "Expired";
                expired++;
            }
            else if(remaining <= 3){
                status = "Expiring Soon";
                expiring++;
            }
            else{
                status = "Active";
                active++;
            }

            System.out.println("Product ID: " + pr_ID);
            System.out.println("Type: " + pr_type);
            System.out.println("Warranty Period: " + warranty_period + " months");
            System.out.println("Months Used: " + month_purchase);
            System.out.println("Remaining: " + remaining + " months");
            System.out.println("Status: " + status);

            if(i < n){
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + active);
        System.out.println("Expiring Soon: " + expiring);
        System.out.println("Expired Warranties: " + expired);
    }
}