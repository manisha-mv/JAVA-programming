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

            double cost = original_value * (tax/100.0);
            double total_bill = original_value + cost;
            System.out.printf("Total Bill %.2f: ",total_bill);
    }
}


