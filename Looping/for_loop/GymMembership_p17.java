import java.util.Scanner;

public class GymMembership_p17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ct = 0;
        double total_renewal= 0.0;
        // double 
        

        for(int i = 1;i<=n;i++){
            String member_name = sc.next();
            String type  = sc.next();
            int days = sc.nextInt();
            
            int renewal_fee = 0;
            int Discount = 0;
            double final_fee = 0.0;
            String  Priority = "";
            


            System.out.println();
            System.out.println("Memeber : "+member_name);
            System.out.println("Membership  :"+type);
            System.out.println("Days Untill Expiry : "+days);
            if(type.equals("Basic")){
                renewal_fee = 50;
            }
            else if(type.equals("Premium")){
                renewal_fee = 100;
            }
            else if(type.equals("VIP")){
                renewal_fee = 200;
            }
            System.out.println("Renewal Fee : $"+renewal_fee);
            if(days>=45){
                Discount = 20;
            }
            else if(days>=30 && days<=44){
                Discount =  15;
            }
            else if(days>=15 && days<=29){
                Discount =  10;
            }
            else if(days<15){
                Discount =  0;
            }
            
            final_fee = renewal_fee*(1-(double)Discount/100.0);
            System.out.println("Discount : "+Discount+"%");
            System.out.println("Final Fee : $"+final_fee);
            if(days<=10){
                Priority = "Urgent";
                ct++;
            }
            else if(days>=10 && days<=30){
                Priority = "High";
            }
            else if(days>=30){
                Priority = "Normal";
            }
            System.out.println("Priority : "+Priority);
            System.out.println();
            total_renewal+=final_fee;
        }
        System.out.println("Total Members : "+n);
        System.out.println("Urgent Renewals : "+ct);
        System.out.println("Total Renewal Revenue : $"+total_renewal);
        System.out.println("Average Renewal Fee: $"+total_renewal/n);
        System.out.println();
    }
}
