import java.util.Scanner;

public class p8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int id =  sc.nextInt();

        if(age>=18 && id==1){
            System.out.printf("Allowed");
        }
        else{
            System.out.println("Denied");
        }
        sc.close();;
    }
}
