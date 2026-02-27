import java.util.Scanner;

public class ATmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw % 100 != 0) {
            System.out.println("Transaction Failed");
            System.out.println("Reason: Amount should be multiple of 100");
        } 
        else if ((balance - withdraw) < 1000) {
            System.out.println("Transaction Failed");
            System.out.println("Reason: Minimum balance of 1000 must be maintained");
        } 
        else {
            balance = balance - withdraw;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}
