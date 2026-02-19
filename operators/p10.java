import java.util.Scanner;

public class p10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int unit_consume = sc.nextInt();
        int fluctuation = sc.nextInt();

        if(unit_consume>500 || fluctuation==1){
            System.out.println("Alert Triggered");
        }
        else{
            System.out.println("Normal Usage");
        }
        sc.close();
    }
}