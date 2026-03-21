import java.util.Scanner;

public class Pattern_p25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int i = 1;

        do{
            int j = 1;
        do{
            System.out.print(" "+i);
            j++;
        }while(j<=i);
        System.out.println();
        i++;

    }while(i<=n);
    }
}
