import java.util.Scanner;

public class p6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int f_income = sc.nextInt();
        int percentage =  sc.nextInt();

        if(f_income<200000 && percentage>=75){
            System.out.printf("Schlorship Granted");
        }
        else{
            System.out.println("Schlorship Rejected");
        }
        sc.close();;
    }
}
