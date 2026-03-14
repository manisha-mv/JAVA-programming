import java.util.Scanner;

public class ATM_p6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int current_balance = sc.nextInt();
        int withdraw_amt =0;
       do{
         System.out.print("Enter the withdrawal Amount : ");
             withdraw_amt = sc.nextInt();

            if(withdraw_amt<current_balance){
                int balance = current_balance-withdraw_amt;
                System.out.println("Withdrawal Sucessful !! Remaining Balance : "+balance);
            }
            else if(withdraw_amt>current_balance){
                System.out.println("Insufficient funds!! Try again");
            }
       }while(withdraw_amt>current_balance);
        sc.close();
    }
}

