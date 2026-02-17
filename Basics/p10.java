import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int deliveries = scanner.nextInt();
        int payout = scanner.nextInt();
        int incentive = scanner.nextInt();
        int fuelCost = scanner.nextInt();

        int netEarnings = (deliveries * payout) 
                          + incentive 
                          - fuelCost;

        System.out.println("Driver Earnings = " + netEarnings);

        scanner.close();
    }
}
