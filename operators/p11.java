import java.util.Scanner;

public class p11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int Base_box=sc.nextInt();
        int level = sc.nextInt();

        int capa = Base_box<<level;

        System.out.println("Capacity : "+capa);
        sc.close();
    }
}
