import java.util.Scanner;

public class p25{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        long registration = scanner.nextLong();
        long broadcast = scanner.nextLong();
        long sponsor = scanner.nextLong();
        long prize = scanner.nextLong();
        long rent = scanner.nextLong();
        long advertising = scanner.nextLong();
        
        
        long remainingFund = registration
                             + broadcast
                             + sponsor
                             - prize
                             - rent
                             - advertising;
        
        
        System.out.println("Remaining Tournament Fund = " + remainingFund);
        
        scanner.close();
    }
}
