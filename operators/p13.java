import java.util.Scanner;

public class p13 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a & b)!=0){
            System.out.println("Appliance Active");
        }
        else{
            System.out.println("Inactive");
        }
        sc.close();
}
}
