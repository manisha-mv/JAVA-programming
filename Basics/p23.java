import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        long weight = scanner.nextLong();
        long ratePerKg = scanner.nextLong();
        long priorityCharges = scanner.nextLong();
        long insuranceFees = scanner.nextLong();
        long handlingCharges = scanner.nextLong();
        long fuelSurcharge = scanner.nextLong();
        
        
        long revenue = (weight * ratePerKg)
                       + priorityCharges
                       + insuranceFees
                       - handlingCharges
                       - fuelSurcharge;
        
        
        System.out.println("Cargo Revenue = " + revenue);
        
        scanner.close();
    }
}
