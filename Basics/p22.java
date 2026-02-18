import java.util.Scanner;

public class p22{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int copies  = scanner.nextInt();
        int cost = scanner.nextInt();
        int editing = scanner.nextInt();
        int design = scanner.nextInt();
        int commision = scanner.nextInt();
        int marketing = scanner.nextInt();

        int Publish  = (copies*cost)
                                +editing
                                -design
                                -commision
                                -marketing;

        System.out.println(" Publish  Profit = " + Publish);

        scanner.close();
    }
}

