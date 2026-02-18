import java.util.Scanner;

public class p3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int w_hrs = sc.nextInt();
        int attendance = sc.nextInt();

        if(w_hrs>40 && attendance>90){
            System.out.println("Bonus Eligible");
        }
        else{
            System.out.print("Bonus Not Eligible");
        }
        sc.close();
        }
}