
import java.util.Scanner;

public class SchlorshipEligibiltyp8 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String Tier = sc.next();
        int sq_ft = sc.nextInt();
        int age = sc.nextInt();
        int amenity = sc.nextInt();

        double base_price = 0.0;
        int age_adjust = 0;
        double amenity_bonus = 0.0;

        double base_value = 0.0;
        

        if(Tier.equals("Prime")){
            base_price = 400;
        }
        else if(Tier.equals("Urban")){
            base_price = 300;
        }
        else if(Tier.equals("Suburban")){
            base_price = 180;
        }
        else if(Tier.equals("Rural")){
            base_price = 100;
        }

       if (age >= 0 && age <= 5) {
            age_adjust = 0;
        } else if (age >= 6 && age <= 15) {
            age_adjust = -5;
        } else if (age >= 16 && age <= 30) {
            age_adjust = -15;
        } else {
            age_adjust = -25;
        }

         base_value = sq_ft*base_price;

        if(amenity>=80 && amenity<=100){
            amenity_bonus = base_value*0.10;
        }
        else if(amenity>=60 && amenity<=79){
            amenity_bonus = base_value*0.05;
        }
        else if(amenity>=40 && amenity<=59){
            amenity_bonus = base_value*0.02;
        }
        else {
            amenity_bonus = 0;
        }

        double adjust_value = base_value*(1+ age_adjust/100.0);
        double fin = adjust_value+amenity_bonus;

        String market  = " ";


    if ((Tier.equals("Prime") || Tier.equals("Urban")) && age < 15) {
        market = "Hot";
    } 
    else if (Tier.equals("Suburban")) {
        market = "Stable";
    } 
    else {
        market = "Slow";
    }

    System.out.println("Location Tier: " + Tier);
    System.out.println("Square Footage: " + sq_ft + " sq ft");
    System.out.println("Property Age: " + age + " years");
    System.out.println("Amenity Score: " + amenity);
    System.out.println("Base Price Per Sq Ft: $" + base_price);
    System.out.println("Age Adjustment: " + age_adjust + "%");
    System.out.printf("Amenity Bonus: $%.1f%n" , amenity_bonus);
    System.out.printf("Estimated Property Value: $%.1f%n" ,fin);
    System.out.println("Market Category: " + market);

        sc.close();



    }
}
