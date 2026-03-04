import java.util.Scanner;
public class FoodDelivery_p24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double order_value = sc.nextDouble();
        String timeSlot = sc.next();
        String weather = sc.next();

        double base_delivery_fee = 3.0;
        double  distance_charge = 0.00;
        double total_distance_charge = 0.00;
        total_distance_charge = distance_charge*1.00;

        double peak_charge = 0.0;
        double  weather_charge = 0.0;
        double order_value_discount = 0.0;
        double final_fee = 0.0;
        double estimate_time = 0;

        int peak_time_delay = 0;
        int weather_delay = 0;
        double base_time = 0;
        String service_prior = "";

        if(timeSlot.equals("Breakfast")){
            peak_charge = 0.0;
        }
        else if(timeSlot.equals("Lunch")){
            peak_charge = 2.50;
            peak_time_delay = 10;
        }
        else if(timeSlot.equals("Dinner")){
            peak_charge = 2.00;
            peak_time_delay =10;
        }
        else if(timeSlot.equals("Late-Night")){
            peak_charge = 1.50;
        }

        if(weather.equals("Clear")){
            weather_charge = 0;
        }
        else if(weather.equals("Rain")){
            weather_charge = 2.0;
            weather_delay = 5;
        }
        else if(weather.equals("Snow")){
            weather_charge = 3.0;
            weather_delay = 10;
        }
        else if(weather.equals("Storm")){
            weather_charge = 5.0;
            weather_delay = 15;
        }

        if(order_value>=30.00 && order_value<=49.00){
            order_value_discount = 1.0;
        }
        else if(order_value>=50 && order_value<=74.99){
            order_value_discount = 3.0;
        }
        else if(order_value>=75){
            order_value_discount = 5.0;
        }

        final_fee = base_delivery_fee+total_distance_charge+peak_charge
        +weather_charge-order_value_discount;

        base_time = total_distance_charge*8;
        estimate_time = base_time+total_distance_charge+peak_time_delay+weather_delay;

        if(order_value>60.0){
            service_prior = "Express";
        }
        else if(timeSlot.equals("Dinner") || timeSlot.equals("Lunch")){
            service_prior = "High";
        }
        else{
            service_prior = "Standard";
        }
        System.out.println();
        System.out.println("======Delivery Details======");
        System.out.println();
        System.out.println("Delivery Distance : "+distance+" miles");
        System.out.println("Order Value : $"+order_value);
        System.out.println("Time Slot : "+timeSlot);
        System.out.println("Weather Condition : "+weather);
        System.out.println("Base Delivery Fee : "+base_delivery_fee);
        System.out.println("Distance Surcharge : $ "+total_distance_charge);
        System.out.println("Peak Time Surcharge : $ "+peak_charge);
        System.out.println("Weather Surcharge : $"+weather_charge);
        System.out.println("Order Value Discount : $ "+order_value_discount);
        System.out.println("Final Delivery : $ "+final_fee);
        System.out.println("Estimated Delivery Time : "+estimate_time+" minutes");
        System.out.println("Service Priority : "+service_prior);
        sc.close();
    }
}
