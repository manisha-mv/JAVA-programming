import java.util.Scanner;

public class Reverse_p5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int rev = 0;
       int  num = n;
        while(n!=0){
            d = n%10;
            rev = rev*10+d;
            n = n/10;

            // int num = n;
        }
        System.out.println("Original : "+num);
        System.out.println("Reversed : "+rev);
        sc.close();
    }
}

