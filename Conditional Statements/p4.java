import java.util.Scanner;

public class EcommerDynamic{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        String tier = sc.next();
        double cart = sc.nextDouble();
        String Category = sc.next();
        String member = sc.next();

        int b_d = 0;
        int a_d = 0;
        int a1_d = 0;
        int total_d = 0;
        double fin = 0.0;
        double saving = 0.0;
        double fin1 = 0.0;

        if(tier.equals("Bronze")){
            b_d =5;
        }
        else if(tier.equals("Silver")){
            b_d = 8;
        }
        else if(tier.equals("Gold")){
            b_d = 12;
        }
        else if(tier.equals("Platinum")){
            b_d = 15;
        }
            // additional Discount
        if(cart>=500 && cart<=999){
            a1_d = 3;
        }
        else if(cart>=1000 && cart<=1999){
            a1_d = 5;
        }
        else if(cart>2000){
            a1_d = 7;
        }

        // specific bonus
        if(Category.equals("Electronics") && (member.equals("Prime"))){
            a_d = a1_d+5;
        }
        else if(Category.equals("Fashion")){
            a_d = a1_d +3;
        }
        else if(Category.equals("Books")){
            a_d =a1_d+ 5;
        }
        else if(Category.equals("Groceries")){
              if(cart>=300){
                a_d = 2;
         }
        }

        total_d = b_d +a_d;
        fin = cart-(cart*total_d/100);
        saving = cart- fin;

        

        System.out.println("===Total Discount===");
        System.out.println();

        System.out.println("Loyalty Tier : "+tier);
        System.out.println("Cart Value : $"+cart);
        System.out.println("Product Category : "+Category);
        System.out.println("Membership : "+member);
        System.out.println("Base Discount : "+b_d+"%");
        System.out.println("Additional Discount : "+a_d+"%");
        System.out.println("Total Discount : "+total_d+"%");
        System.out.println("Final  price : $"+fin);
        System.out.println("Savings : $"+saving);

        sc.close();
    }
}
