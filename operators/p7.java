import java.util.Scanner;

public class p7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int cart_value = sc.nextInt();
        int premium =  sc.nextInt();

        if(cart_value>999 ||  premium==1){
            System.out.printf("Free Shiping");
        }
        else{
            System.out.println("Shipping Charges applied");
        }
        sc.close();;
    }
}
