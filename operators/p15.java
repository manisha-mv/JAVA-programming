import java.util.Scanner;

public class p15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int s_value = sc.nextInt();
        int toggle = sc.nextInt();

        int t_signal = s_value^toggle;

        System.out.println("Toggle Signal = "+t_signal);
        sc.close();
    }
}
