import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distance  = scanner.nextInt();
        int rate = scanner.nextInt();
        int maintain = scanner.nextInt();
        int allowance = scanner.nextInt();
        int subsidy = scanner.nextInt();

        int transport_fee = (distance * rate)
                            + maintain
                            + allowance
                            -subsidy;

        System.out.println("Total Transport Fee = " + transport_fee);

        scanner.close();
    }
}

