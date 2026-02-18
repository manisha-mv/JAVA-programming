import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ticket = scanner.nextInt();
        int snack = scanner.nextInt();
        int maintain = scanner.nextInt();
        int electricity = scanner.nextInt();

        int finalYield = (ticket + snack)
                         - maintain
                         - electricity;

        System.out.println("Net Profit Yield = " + finalYield);

        scanner.close();
    }
}
