import java.util.Scanner;

public class RestaurantOrderProcess_p10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total_items = 0;
        double total_subtotal = 0.0;
        double tax = 0.0;
        double service_charge = 0.0;
        double grand_total = 0.0;

        for(int i = 1;i<=n;i++){
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            double subtotal = 0.0;
        
            total_items +=quantity;
            subtotal = price*quantity;
            total_subtotal +=subtotal;
            tax = total_subtotal*0.08;
            service_charge = total_subtotal*0.10;
            grand_total = total_subtotal + tax+service_charge;

            System.out.println();
            System.out.println("Item : "+name);
            System.out.println("Price : $"+price+" X "+quantity);
            System.out.println("Subtotal : $"+subtotal);
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Item: "+total_items);
        System.out.println("Subtotal : $"+total_subtotal);
        System.out.printf("Tax (8%%): $%.2f\n",tax);
        // System.out.printf("Service Charge (10%): $%.2f\n",service_charge);
        System.out.printf("Service Charge (10%%): $%.2f\n", service_charge);
        // System.out.printf("Savings : "+"%.2f%%\n ",Savings);
        System.out.println("Grand Total : $"+grand_total);
        System.out.println();
        sc.close();
    }
}
