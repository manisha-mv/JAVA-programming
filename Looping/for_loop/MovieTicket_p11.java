import java.util.Scanner;

public class MovieTicket_p11{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double original_total = 0.0;
        double Discount_total = 0.0;
        double Final_total = 0.0;
        String grp_discount = "";
        

        for(int i = 1;i<=n;i++){
            String seat_type = sc.next();
            String customer_type = sc.next();

            double base_price = 0.0;
            int Discount = 0;
            
            double price = 0.0;
            int add = 0;

            System.out.println();
            System.out.println("Ticket "+i+" :"+seat_type+"-"+customer_type);

            if(seat_type.equals("Regular")){
                base_price = 12.0;
            }
            else if(seat_type.equals("Premium")){
                base_price = 18.0;
            }
            else if(seat_type.equals("Recliner")){
                base_price = 25.0;
            }

            System.out.println("Base Price :$ "+base_price);

            if(customer_type.equals("Adult")){
                Discount  = 0;
            }
            else if(customer_type.equals("Child")){
                Discount = 30;
            }
            else if(customer_type.equals("Senior")){
               
                Discount = 25;
            }
            if(n>=5){
                Discount+=10;
            }
            price = base_price*(1-Discount/100.0);
            System.out.println("Discount : "+Discount+"%");
            System.out.printf("Final Price : $%.1f\n",price);
            System.out.println();

            original_total+=base_price;
            Final_total +=price;
        }
         Discount_total =original_total-Final_total;
        System.out.println();
        System.out.println("Total Tickets :"+n);
        System.out.printf("Original total : $%.1f\n",original_total);
        System.out.printf("Total Discount  : $%.1f\n",Discount_total);
        System.out.printf("Final Total : $%.1f\n",Final_total);
        if(n>=5){
            grp_discount ="YES";
            
        }
        else {
            grp_discount = "No";
        }
        System.out.println("Group Discount Applied : "+grp_discount);
        System.out.println();
        sc.close();
    }
}
