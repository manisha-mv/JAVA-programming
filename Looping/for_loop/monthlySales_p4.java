import java.util.Scanner;


public class monthlySales_p4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
         double total_sale_amt = 0.0;
         double total_commision_earned = 0.0;
         double max = 0;
         String Top_performer = "";

        for(int i = 0;i<n;i++){
            
            // int n_sales = sc.nextInt();
        
            String repname = sc.next();
            double sale_amt = sc.nextDouble();
            // sale_amt[n] = 0;

            double commision_rate = 0;
            double commision_earned = 0.0;
            double total_payout ;
            
            
            double bonus = 0;
           

            if(sale_amt>0 && sale_amt<=40000){
                commision_rate = 5;
            }
            else if(sale_amt<=80000){
                commision_rate = 8;
            }
            else if(sale_amt<=100000){
                commision_rate = 10;
            }
            else if(sale_amt<=150000){
                commision_rate = 12;
            }
            else if(sale_amt>=150000){
                commision_rate = 15;
            }

             max = Math.max(max,sale_amt); 


            if(sale_amt<=150000){
                bonus = 3000;
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            else if(sale_amt>=100000){
                bonus = 2000;
            }

            commision_earned = sale_amt*(commision_rate/100.0);



            total_payout = commision_earned+bonus;
            
            total_sale_amt +=sale_amt;
            total_commision_earned +=commision_earned;

            if(sale_amt>max){
                max = sale_amt;
                Top_performer = repname;
            }

            System.out.println();
            System.out.println("Sales Rep: "+repname);
            System.out.println("Sales Amount : "+sale_amt);
            System.out.println("Commision Rate : "+commision_rate+"%");
            System.out.println("Commision Earned : $"+commision_earned);
            System.out.println("Bonus : $"+bonus);
            System.out.println("Total Payout : $"+total_payout);
            System.out.println();
            
        }
        System.out.println("Total Sales Rep : "+n);
        System.out.println("Total Sales : "+total_sale_amt);
        System.out.println("Total Commisiones : "+total_commision_earned);
        System.out.println("Top Performer : "+max);
        System.out.println();
        sc.close();
    }
}
