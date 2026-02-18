import java.util.Scanner;

public class p5 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int total_Bill =sc.nextInt();
        int service = sc.nextInt();
        int gst = sc.nextInt();
        int no_p = sc.nextInt();

        double final_bill = total_Bill+(total_Bill*(service/100.0));

        double bill = final_bill*gst/100;
        double add_split = bill+final_bill;
        double final_split = add_split/no_p;
        System.out.printf("Amt per person:  %.2f ",final_split);

        sc.close();

    }
}
