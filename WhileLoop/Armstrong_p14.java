import java.util.Scanner;

public class Armstrong_p14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d ;
        int original  = n;
        int mul = 0;
        int sum = 0;
        while(n>0){
            d = n%10;
            mul = d*d*d;
            sum = sum + mul;
            n = n/10;
        }
        if(original==sum){
            System.out.println(original+" is an Armstrong Number");
        }
        else{
            System.out.println(original+" is not a Armstrong number ");
        }
        sc.close();
    }
}
