import java.util.Scanner;

public class BankProcessor_p20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total_deposits = 0;
        double total_Withdrawal = 0;
        double total_transfer = 0;
        double total_payment = 0;
        double net_balance = 0;
        
        for(int i = 1;i<=n;i++){
            String type = sc.next();
            double amt = sc.nextDouble();

            String category  = "";

            System.out.println();
            System.out.println("Transaction "+i+" : "+type);
            System.out.println("Amount : $"+amt);
            if(type.equals("Deposit")){
                category = "Credit";
                total_deposits +=amt;
            }
            else if(type.equals("Withdrwal") || (type.equals("Tranfer") || (type.equals("Payment")))){
                category = "Debit";
            }
            System.out.println("Category : "+category);
            System.out.println();
            if(type.equals("Withdrawal")){
                total_Withdrawal+=amt;
            }
            else if(type.equals("Transfer")){
                total_transfer+=amt;
            }
            else if(type.equals("Payment")){
                total_payment+=amt;
            }
            net_balance = total_deposits-(total_Withdrawal+total_transfer+total_payment);
        }
        System.out.println();
        System.out.println("Total Transactions : "+n);
        System.out.println("Total Deposits : $"+total_deposits);
        System.out.println("Total Withdrawals : $"+total_Withdrawal);
        System.out.println("Total Transfers : $"+total_transfer);
        System.out.println("Total Payments : $"+total_payment);
        System.out.println("Net Balance Change : $"+net_balance);
        System.out.println();
        sc.close();
    }
}
