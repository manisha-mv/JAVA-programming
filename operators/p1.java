import java.util.Scanner;

public class p1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int t_m = sc.nextInt();
        int p_m = sc.nextInt();
         int avg = (t_m+p_m)/2;


        if(t_m>=50 && p_m>=50 && avg>=60){
            // if(avg>=60){
                System.out.println("PASS");
            // }
        }
        else{
            System.out.println("FAIL");
        }
         sc.close();
    }
}
