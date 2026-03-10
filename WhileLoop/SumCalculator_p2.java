import java.util.Scanner;

public class SumCalculator_p2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        
        int sum = 0;
        int count = 0;
        int n = -1;
        
        while(n!=0){
            System.out.print("Enter number (0 to stop) : ");
            n = sc.nextInt();
            
            

            if(n!=0){
                sum = sum+n;
                count++;
            }

        }
        System.out.println("Total sum : "+sum);
        System.out.println("Count : "+count);
        sc.close();
}

}