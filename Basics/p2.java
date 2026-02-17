import java.util.Scanner;

public class p2 {
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            int Base_ct = scanner.nextInt();
            int Extra_ct = scanner.nextInt();
            int rate = scanner.nextInt();
            int tax = scanner.nextInt();

            int extra_value  = Extra_ct*rate;
            int original_value = Base_ct+extra_value;

            int cost = original_value+(original_value*tax);
            int total_bill = Base_ct + cost;



            System.out.println("Total Bill : "+total_bill);

            
    }
}
