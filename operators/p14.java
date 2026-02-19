import java.util.Scanner;

public class p14 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int p1 =sc.nextInt();
        int p2 = sc.nextInt();

       int merge = p1 | p2;

       System.out.println("Merged value = "+merge);
       sc.close();

    }
}
