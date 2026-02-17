import java.util.Scanner;

public class p4 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int t_fee = sc.nextInt();
        int scholar = sc.nextInt();
        int exam_fee =sc.nextInt();
        int l_fee = sc.nextInt();

        int sch_dis = t_fee-(t_fee*scholar/100);
        int total_fee = sch_dis+exam_fee+l_fee;

        System.out.println("Total Fee : "+total_fee);
        sc.close();
    }
}
