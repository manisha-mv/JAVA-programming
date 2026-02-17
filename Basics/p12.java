import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yieldPerAcre = scanner.nextInt();
        int acres = scanner.nextInt();
        int extraYield = scanner.nextInt();
        int damagedCrops = scanner.nextInt();

        int finalYield = (yieldPerAcre * acres)
                         + extraYield
                         - damagedCrops;

        System.out.println("Marketable Yield = " + finalYield);

        scanner.close();
    }
}
