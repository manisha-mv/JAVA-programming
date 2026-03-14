import java.util.Scanner;

public class Digit_sum_cal_p8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = 0;
        int sum = 0;
        int original = n;
        while(n!=0){
            d = n%10;
            sum = sum +d;
            n = n/10;
        }
        System.out.println("Number : "+original);
        System.out.println("Sum of Digits : "+sum);
        sc.close();
    }
}
