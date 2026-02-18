import java.util.Scanner;

public class p5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int Credit =  sc.nextInt();

        if(salary>25000 && Credit>700){
            System.out.printf("Loan Approved");
        }
        else{
            System.out.println("Loan Rejected");
        }
        sc.close();;
    }
}
