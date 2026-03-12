import java.util.Scanner;

public class FibonacciSequence_p10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int res = 0;
        int n = sc.nextInt();
        int i =2;
        System.out.println(a);
        System.out.println(b);
        while(i<n){
            res = a + b;
            a = b;
            b = res;
            i++;
            System.out.println(res);

        }
    }
}

