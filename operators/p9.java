import java.util.Scanner;

public class p9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int username = sc.nextInt();
        int pass = sc.nextInt();
        int ac_Locked = sc.nextInt();

        if(username==1 && pass==1 && ac_Locked==0){
            System.out.println("Login Success");
        }
        else{
            System.out.println("Login Failed");
        }
        sc.close();
    }
}
