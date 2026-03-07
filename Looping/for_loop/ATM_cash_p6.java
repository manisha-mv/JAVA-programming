import java.util.Scanner;

public class ATM_cash_p6 {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

         double current_balance = sc.nextDouble();
         int n_attempt = sc.nextInt();
         int sucess_count = 0;
         int fail_count = 0;
         double final_balance=0.0;
         double  total_withdrawn =0.0;

        for(int i = 1;i<=n_attempt;i++){
            double withdraw_amt = sc.nextDouble();
            // String status = "";
            double remain_balance = 0.0;

            // total_withdraw = 
            System.out.println();
            System.out.println("Transaction  "+i+" : $ "+withdraw_amt);
            if(withdraw_amt<=current_balance){
                System.out.println("Status : Approve");
                remain_balance=current_balance-withdraw_amt;
                current_balance =remain_balance; 
                sucess_count++;
                final_balance =remain_balance-total_withdrawn;
                total_withdrawn +=withdraw_amt;
            }else{
                System.out.println("Status : Denied");
                System.out.println("Reason : Insufficient Balance");
                fail_count++;
            }
            System.out.println("Remaining Balance :$ "+remain_balance);
            System.out.println();
        }
        System.out.println("After : ");
        System.out.println("Total Transaction : "+n_attempt);
        System.out.println("Success Withdrawals : "+sucess_count);
        System.out.println("Failed Withdrawals : "+fail_count);
        System.out.println("Final Balance : $"+final_balance);
        System.out.println("Total withdrawn :$ "+total_withdrawn);
        sc.close();

    }
}
