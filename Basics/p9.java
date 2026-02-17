import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int roomCharge = scanner.nextInt();
        int days = scanner.nextInt();
        int medicineCost = scanner.nextInt();
        int labFees = scanner.nextInt();
        int insuranceCoverage = scanner.nextInt();

        int finalBill = (roomCharge * days) 
                        + medicineCost 
                        + labFees 
                        - insuranceCoverage;

        System.out.println("Payable Amount = " + finalBill);

        scanner.close();
    }
}
