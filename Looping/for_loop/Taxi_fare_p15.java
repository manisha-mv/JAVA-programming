import java.util.Scanner;

public class Taxi_fare_p15 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
         double total_distance = 0.0;
         double total_revenue = 0.0;

        for(int i = 1;i<=n;i++){
            double distance = sc.nextDouble();
            String time_of_day = sc.next();

            double base_fare = 3.00;
            double distance_charge = 0.0;
            double time_surcharge = 0.0;
            double total_fare = 0.0;
           
            System.out.println();
            System.out.println("Ride :"+i);
            System.out.println("Distance : "+distance+"km");
            System.out.println("Time : $"+time_of_day);
            System.out.println("Base Price : $"+base_fare);
            distance_charge = distance*1.00;
            System.out.println("Distance Charge : "+distance_charge);
            if(time_of_day.equals("Morning") || (time_of_day.equals("Afternoon"))){
                time_surcharge = 0;
            }
            else if(time_of_day.equals("Evening")){
                time_surcharge = 3;
            }
            else if(time_of_day.equals("Night")){
                time_surcharge =5;
            }
            System.out.println("Times Surcharge : $"+time_surcharge);
            total_fare = base_fare+distance_charge+time_surcharge;
            System.out.println("Total Fare : $"+total_fare);
            System.out.println();
            total_distance+=distance;
            total_revenue+=total_fare;
        }
        System.out.println();
        System.out.println("Total Rides : "+n);
        System.out.println("Total Distance : "+total_distance);
        System.out.println("Total Revenue :  $"+total_revenue);
        System.out.printf("Average Fare : $%.2f\n",total_revenue/n);
        System.out.println();
        sc.close();
    }
}
