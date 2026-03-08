import java.util.Scanner;

public class productPriceDiscount_p8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

         int total_quantity = 0;
         double original_total = 0.0;
         double final_total = 0.0;
         double total_Discount = 0.0;
         double Savings = 0.0;

        for(int i = 1;i<=n;i++){
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            int discount = 0;
            double subtotal = 0.0;
            double total = 0.0;

            System.out.println();
            System.out.println("Product : "+name);
            System.out.println("Unit Price : $"+price);
            System.out.println("Quantity : "+quantity);

            if(quantity<=1){
                discount =0;
            }
            else if(quantity>=2 && quantity<=4){
                discount = 10;
            }
            else if(quantity>=5 && quantity<=9){
                discount = 15;
            }
            else if(quantity>=10){
                discount = 20;
            }

            System.out.println("Discount : "+discount+"%");
            total = price*quantity;
            original_total +=total;

            subtotal = total*(1-discount/100.0);
            total_quantity +=quantity;
            double discount_amt = total-subtotal;
            final_total +=subtotal;
            total_Discount +=discount_amt;
            
            Savings =(total_Discount/original_total)*100.0;
            System.out.println("Subtotal :$"+subtotal);

            System.out.println();
        }
        System.out.println();
        System.out.println("Total Items : "+total_quantity);
        System.out.println("Original Total :$ "+original_total);
        System.out.println("Total Discount :$ "+total_Discount);
        System.out.println("Final Total : $"+final_total);
        System.out.printf("Savings : "+"%.2f%%\n ",Savings);
        sc.close();
    }
}
