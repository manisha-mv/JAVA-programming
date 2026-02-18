import java.util.Scanner;

public class p6 {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int price = sc.nextInt();
        int toll = sc.nextInt();

        int fine_total = (distance/mileage)*price;
        int total_trip = fine_total+toll;

        System.out.println("Total Trip Cost : "+total_trip);

        sc.close();
        }
}
