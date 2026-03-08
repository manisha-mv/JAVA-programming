import java.util.Scanner;

public class Parking_feeCalculator_p12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total_revenue = 0.0;
         int count = 0;

        for(int i = 1;i<=n;i++){
            String type = sc.next();
            double hrs_parked = sc.nextDouble();

            double hrs_rate = 0.0;
            double park_fee =0.0;
            String cap = "";
           
            System.out.println();
            System.out.println("Vehicle "+i+" : "+type);
            System.out.println("Hours Parked : "+hrs_parked);
            if(type.equals("Car")){
                hrs_rate = 3.0;
            }
            else if(type.equals("Motorcycle")){
                hrs_rate = 2.0;
            }
            else if(type.equals("Truck")){
                hrs_rate = 5.0;
            }
            else if(type.equals("Bus")){
                hrs_rate = 7.0;
            }
            park_fee = hrs_parked*hrs_rate;
            System.out.println("Hourly Rate : $"+hrs_rate);
            System.out.println("Parking Fee : $"+park_fee);
            if(type.equals("Car") && park_fee==30.0){
                cap = "YES";
            }
            else if(type.equals("Motorcycle") && park_fee==20.0){
                cap = "YES";
            }
            else if(type.equals("Truck") && park_fee==60.0){
                cap = "YES";
            }
            else if(type.equals("Motorcycle") && park_fee==100.0){
                cap = "YES";
            }
            else {
                cap = "NO";
            }
            System.out.println("Cap Applied : "+cap);
            System.out.println();
            total_revenue+=park_fee;
            if(hrs_parked>=8){
            count++;
        }
        }
        System.out.println();
        System.out.println("Total Vehicles : "+n);
        System.out.println("Total Revenue : $"+total_revenue);
        System.out.println("Average Fee : $"+total_revenue/n);
        System.out.println("Peak Hour Vehicles (>8hours):"+count);
        System.out.println();
    }
}
