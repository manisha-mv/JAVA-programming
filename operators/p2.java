import java.util.Scanner;

public class p2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int ac_balance = sc.nextInt();
        int withdraw_amt = sc.nextInt();
        int daily_limit = sc.nextInt();

        if(withdraw_amt<=ac_balance || withdraw_amt>=daily_limit){
            System.out.printf("Transaction Approved");
        }
        else{
            System.out.printf("Transaction Declined");
        }
        sc.close();
    }
}