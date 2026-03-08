import java.util.Scanner;

public class FittenesTracker_p9 {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int total_min = 0;
        int total_calorie = 0;
        double average = 0.0;
        String fitness_level = "";


        for(int i = 1;i<=n;i++){
            String session_type = sc.next();
            int min = sc.nextInt();

            int calorie_burned = 0;
            String intensity = "";
            

            System.out.println();
            System.out.println("Session "+ i +": "+session_type);
            System.out.println("Duration : "+min+" minutes");

            if(session_type.equals("Running")){
                calorie_burned = 10*min;
                intensity = "High Intensity ";
            }
            else if(session_type.equals("Swimming")){
                calorie_burned = 12*min;
                intensity = "High Intensity";
            }
            else if(session_type.equals("Cycling")){
                calorie_burned = 8*min;
                intensity = "Moderate Intensity";
            }
            else if(session_type.equals("Gym")){
                calorie_burned = 7*min;
                intensity = "Moderate Intensity";
            }
            else if(session_type.equals("Walking")){
                calorie_burned = 4*min;
                intensity = "Low Intensity";
            }
            System.out.println("Calorie Burned : "+calorie_burned);
            System.out.println("Intensity : "+intensity);
            total_min +=min;
            total_calorie +=calorie_burned;
            average = total_calorie/n;
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Workouts : "+n);
        System.out.println("Total Duration : "+total_min+" minutes");
        System.out.println("Total Calorie Burned : "+total_calorie);
        System.out.println("Average Calories per Session : "+average);
        if(total_calorie<=300){
            fitness_level = "Beginner";
        }
        else if(total_calorie>300 && total_calorie<=1000){
            fitness_level = "Intermediate";
        }
        else if(total_calorie>1000){
            fitness_level = "Advanced";
        }
        System.out.println("Fitness Level : "+fitness_level);
        sc.close();
    }
}
