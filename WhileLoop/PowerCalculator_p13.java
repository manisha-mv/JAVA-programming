import java.util.Scanner;

public class PowerCalculator_p13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int power = sc.nextInt();
        int res = 1;
        int e = power;

        while(power>0){
            res = n*res;
            power--;
        }
        System.out.println(n+"^"+e+"="+res);
    }
}
