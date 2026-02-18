import java.util.Scanner;

public class p21{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maintain  = scanner.nextInt();
        int parking = scanner.nextInt();
        int hall = scanner.nextInt();
        int security = scanner.nextInt();
        int electricity = scanner.nextInt();
        int clean = scanner.nextInt();

        int Balance  = maintain+parking
                                +hall
                                -security
                                -electricity
                                -clean;

        System.out.println(" Remaining Balance = " + Balance);

        scanner.close();
    }
}

