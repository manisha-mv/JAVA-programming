import java.util.Scanner;

public class GCD_p11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        int n1 = a;
        int n2 = b;

        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD of "+n1+" and "+n2+" = "+ temp);
    }
}
