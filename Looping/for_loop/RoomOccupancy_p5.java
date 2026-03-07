import java.util.Scanner;

public class RoomOccupancy_p5 {
    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        double average_occupany = 0.0;
        int count_full =0;
        double peak_occupancy =0.0;
        int peak_occupancy_day  =0;

        for(int i = 1;i<=n;i++){
            int day = sc.nextInt();
            int room_occupany = sc.nextInt();
            int total_rooms = sc.nextInt();

            double occupancy_rate =0.0;
            String status = "";
            

            occupancy_rate = ((double)room_occupany/total_rooms)*100.0;

            if(occupancy_rate<=60.0){
                status = "Low";
            }
            else if(occupancy_rate>=69.0 && occupancy_rate<=79.0){
                status = "Moderate";
            }
            else if(occupancy_rate>=80.0 && occupancy_rate<=99.0){
                status = "High";
            }
            else if(occupancy_rate==100.0){
                status = "Full";
                count_full++;
            }

            System.out.println("Day : "+i);
            System.out.println("Rooms Occupied : "+room_occupany);
            System.out.println("Total Rooms : "+total_rooms );
            System.out.println("Occupany rate : "+occupancy_rate+"%");
            System.out.println("Status : "+status);
            System.out.println(); 
            
            average_occupany +=occupancy_rate;

           if(occupancy_rate>peak_occupancy){
            peak_occupancy = occupancy_rate;
            peak_occupancy_day = day;
           }
        }
        average_occupany =average_occupany/n;
        System.out.println();
        System.out.println("Total Days Analyzed : "+n);
        System.out.printf("Average Occupancy Rate  : "+"%.2f%%\n",average_occupany);
        System.out.println("Peak Occupany day : Day "+peak_occupancy_day);
        System.out.println("Days at Full Capacity : "+count_full);
        System.out.println();
        sc.close();

    }
}
