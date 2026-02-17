import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rodsPerHour = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        int overtimeRods = scanner.nextInt();
        int rejectedRods = scanner.nextInt();

        int normalRods = rodsPerHour * hoursWorked;
        int usableRods = normalRods + overtimeRods - rejectedRods;

        System.out.println("Usable Rods = " + usableRods);

        scanner.close();
    }
}
