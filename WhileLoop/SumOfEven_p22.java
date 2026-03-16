import java.util.Scanner;

public class SumOfEven_p22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        

        while(st<=end){
            if(st%2==0){
                sum = sum+st;
            }
            st++;
        }
        System.out.println("Sum of even Numbers : "+sum);
        sc.close();
    }
}
