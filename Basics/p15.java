import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rooms = scanner.nextInt();
        int price = scanner.nextInt();
        int service = scanner.nextInt();
        int commision = scanner.nextInt();

        int total_Revenue =(rooms*price)+
                            service
                            -commision;

        System.out.println("Total Revenue = " + total_Revenue);

        scanner.close();
    }
}
