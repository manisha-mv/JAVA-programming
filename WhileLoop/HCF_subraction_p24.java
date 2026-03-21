import java.util.Scanner;

public class HCF_subraction_p24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int original_a = a;
        int original_b = b;

        while(a!=b){
            if(a>b){
                a = a-b;
            }

            else{
                b= b-a;
            }
        }
        System.out.println("HCf of "+ original_a+" and "+original_b+" = "+a);
        sc.close();
    }
}
