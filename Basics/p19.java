import java.util.Scanner;

public class p19{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days  = scanner.nextInt();
        int rent = scanner.nextInt();
        int late = scanner.nextInt();
        int fuel = scanner.nextInt();
        int maintain = scanner.nextInt();

        int Net_Profit = (days*rent)
                        +late
                        -fuel
                        -maintain;

        System.out.println("Net Profit = " + Net_Profit);

        scanner.close();
    }
}

