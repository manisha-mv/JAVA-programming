import java.util.Scanner;

public class Strong_number_p20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rem;
        int fact = 1;
        int sum = 0 ;
        int original = n;

        while(n>0){
            rem = n%10;
            for(int i = rem;i<=1;i--){
                fact = fact*i;
            }
            sum = sum+fact;
            n= n/10;
        }
        if (n == original){
            System.out.println(original+"Strong NUmber");
        } 
        else{
          System.out.print(original+"is not a storng number");
        }       
    }
    }
