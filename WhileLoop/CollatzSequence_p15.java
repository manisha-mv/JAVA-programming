import java.util.Scanner;

public class CollatzSequence_p15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int steps = 0;

        System.out.println("Collatz sequence starting from " + n + ":");

        System.out.print(n);

        if(n != 1){
            do{
                if(n % 2 == 0){
                    n = n / 2;
                }
                else{
                    n = 3 * n + 1;
                }

                System.out.print(" " + n);
                steps++;

            }while(n != 1);
        }

        System.out.println();
        System.out.println("Steps: " + steps);
    }
}
