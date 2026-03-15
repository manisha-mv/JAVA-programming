import java.util.Scanner;

public class PrimeNumCheck_p9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prime = 0;

        if(n<=1){
            System.out.println("Not a Prime Number");
        }

        while(n>0){
            for(int i = 2;i<n;i++){
                if(n%i==0){
                    prime = 1;
                    break;
                }
            }
        }
        if(prime==1){
            System.out.println(n+ " is not a Prime Number");
        }
        else{
            System.out.println(n+" is a Prime Number");
        }
        sc.close();
    }
}
