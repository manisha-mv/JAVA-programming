import java.util.Scanner;

public class passwordValidator_p1 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String crt_pass = sc.next();
        int attempt = 3;

        while(attempt>0){
            System.out.println();
            System.out.println("Enter Password : ");
            String user_pass = sc.next();

            

            if(crt_pass.equals(user_pass)){
                System.out.println("Access Granted !!");
                break;
            }
            else  {
                attempt--;
            }

            if(attempt==0){
                System.out.println("Account Locked !!");
            }
            else {
                System.out.println("Incorrect Password! Attempt Remaining : "+attempt);
            }
        }
        sc.close();
    }
}