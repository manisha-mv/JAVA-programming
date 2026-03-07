// import java.util.Scanner;

// public class product_price_cal_p8 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         double  total_dixcount =0.0;
//         double final_total = 0.0;
//         int totalItems = 0;


        
        
//         for(int i = 1;i<=n;i++){
//             String product_name = sc.next();
//             double price = sc.nextDouble();
//             int quantity = sc.nextInt();
//             // double subtotal= 0.0;

//             int discount = 0;
//             double Original = 0.0;

//             System.out.println();

//             System.out.println("Product : "+product_name);
//             System.out.println("Unit Price : "+price);
//             System.out.println("Quantity : "+quantity);

//             if(quantity==1){
//                 discount = 0;                                                                                                                                                  
//             }
//             else if(quantity>=2 && quantity<=4){
//                 discount = 10;
//             }
//             else if(quantity>=5 && quantity<=9){
//                 discount = 15;
//             }
//             else if(quantity>=10){
//                 discount = 20;
//             }ac
//             original =+ original;
//             double subtotal = (price*quantity)*(1-discount/100);

//             System.out.println("Discount : "+discount+"%");
//             System.out.println("Sub Total : "+subtotal);
//             System.out.println();
//         }
//         total_dixcount = (prise*quantity)
//         System.out.println("Total Items : "+n);
//         System.out.println("Original Total : "+);
//     }
// }


import java.util.Scanner;

public class product_price_cal_p8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double originalTotal = 0.0;
        double finalTotal = 0.0;
        int totalItems = 0;

        for(int i = 1; i <= n; i++){

            String product_name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            int discount = 0;

            System.out.println();

            System.out.println("Product : " + product_name);
            System.out.println("Unit Price : " + price);
            System.out.println("Quantity : " + quantity);

            if(quantity == 1){
                discount = 0;
            }
            else if(quantity >= 2 && quantity <= 4){
                discount = 10;
            }
            else if(quantity >= 5 && quantity <= 9){
                discount = 15;
            }
            else{
                discount = 20;
            }

            double original = price * quantity;
            double subtotal = original * (1 - discount / 100.0);

            System.out.println("Discount : " + discount + "%");
            System.out.println("Sub Total : " + subtotal);

            System.out.println();

            // accumulate totals
            originalTotal += original;
            finalTotal += subtotal;
            totalItems += quantity;
        }

        double totalDiscount = originalTotal - finalTotal;
        double savingsPercentage = (totalDiscount / originalTotal) * 100;

        System.out.println("Total Items : " + totalItems);
        System.out.println("Original Total : " + originalTotal);
        System.out.println("Final Total : " + finalTotal);
        System.out.println("Total Discount : " + totalDiscount);
        System.out.println("Savings Percentage : " + savingsPercentage + "%");

        sc.close();
    }
}