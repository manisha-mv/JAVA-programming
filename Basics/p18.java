import java.util.Scanner;

public class p18{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int register  = scanner.nextInt();
        int sponser = scanner.nextInt();
        int stall = scanner.nextInt();
        int stage = scanner.nextInt();
        int celebrity = scanner.nextInt();
        int marketing = scanner.nextInt();

        int Remaining_fund = register+sponser
                                +stall
                                -stage
                                -celebrity
                                -marketing;

        System.out.println(" Remaining Fund = " + Remaining_fund);

        scanner.close();
    }
}

