import java.util.Scanner;

public class FactorialCalculator_p4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int result = 1;
        int counter = 1;
        int num = sc.nextInt();
        

        while(counter<=num){
            result*= counter;
            counter++;

        }
    System.out.println("Factorial Of "+num +" = "+result);
    }
}

