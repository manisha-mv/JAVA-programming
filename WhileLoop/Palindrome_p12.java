import java.util.Scanner;

public class Palindrome_p12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = 0;
        int rev = 0;
        int original = n;

        while(n!=0){
            d = n%10;
            rev = rev*10 +d;
            n = n/10;

        }
        if(original==rev){
           
            System.out.println(original+" is a palindrome");
        }
        else{
            System.out.println(original+" is not a palindrome");
        }
        sc.close();
    }
}
