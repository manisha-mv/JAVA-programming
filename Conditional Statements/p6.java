import java.util.Scanner;

public class p6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String class_type = sc.next();
        int days_departure = sc.nextInt();
        double seat_avail = sc.nextDouble();
        String route_type = sc.next();

        int base_price = 0;
        double demand  = 0.0;
        double final_price = 0.0;
        String cate = " ";

        if(class_type.equals("Economy")){
            if(route_type.equals("Domestic")){
                base_price = 200;
            }
            else if(route_type.equals("International-Short")){
                base_price =500;
            }
            else if(route_type.equals("International-Long")){
                base_price = 800;
            }
        }else if(class_type.equals("Business")){
            if(route_type.equals("Domestic")){
                base_price =600;
            }
            else if(route_type.equals("International-Short")){
                base_price = 1500;
            }
            else if(route_type.equals("International-Long")){
                base_price =2500;
            }
        }
        else if(class_type.equals("First")){
            if(route_type.equals("Domestic")){
                base_price = 1000;
            }
            else if(route_type.equals("International-Short")){
                base_price = 3000;
            }
            else if(route_type.equals("International-Long")){
                base_price = 5000;
            }
        }

        if(seat_avail< 30 && days_departure<14){
            demand =1.8;
            cate = "High Demand";
        }
        else if(seat_avail<50.0 && days_departure<30){
            demand =1.5;
            cate = "High Demand";
        }
        else if(seat_avail<=60.0 && days_departure>60){
            demand = 0.8;
            cate = "Low demand";
        }
        else if(seat_avail<60.0 && (days_departure>=30 && days_departure<=60)){
            demand = 1.0;
            cate = "Moderate";
        }

        final_price = base_price * demand;

        System.out.println("===========Youre Booking Details=========");
        System.out.println();
        System.out.println("Booking Class : "+class_type);
        System.out.println("Days untill Departure : "+days_departure);
        System.out.println("Seat Availability : "+seat_avail);
        System.out.println("route type : "+route_type);
        System.out.println("Base Price : $"+base_price);
        System.out.println("demand Mutiplexer  : "+demand+"X");
        System.out.println("Final Ticket Price: $"+final_price);
        System.out.println("Pricing Category : "+cate);

        sc.close();
    }
}
