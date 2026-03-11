import java.util.Scanner;

public class PerfectNumber_p17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i<n){
            if(n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(sum == n){
         System.out.println(n+" is Perfect Number");
        }
        else {
            System.out.println(n+" is not a Perfect Number");
        }
        sc.close();
    }
}
