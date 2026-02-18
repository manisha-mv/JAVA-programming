import java.util.Scanner ;

public class p4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int credit_amt=sc.nextInt();
        int p_amt = sc.nextInt();
        int carblocked = sc.nextInt();

        if(p_amt<=credit_amt && carblocked==0){
            System.out.printf("Approved");
        }
        else {
            System.out.println("Declined");
        }
        sc.close();
    }
}
