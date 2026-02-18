import java.util.Scanner;

public class p20{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ad  = scanner.nextInt();
        int sponser = scanner.nextInt();
        int affilate = scanner.nextInt();
        int tax = scanner.nextInt();
        int production = scanner.nextInt();

        int yt_Income = ad+sponser
                        +affilate
                        -tax
                        -production;

        System.out.println("Final YouTube Income= " + yt_Income);

        scanner.close();
    }
}

