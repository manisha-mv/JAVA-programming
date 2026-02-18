import java.util.Scanner;

public class p17{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours  = scanner.nextInt();
        int rate = scanner.nextInt();
        int design = scanner.nextInt();
        int testing = scanner.nextInt();
        int advance = scanner.nextInt();

        int project_cost = (hours * rate)
                            + design
                            + testing
                            -advance;

        System.out.println("Project Cost = " + project_cost);

        scanner.close();
    }
}

