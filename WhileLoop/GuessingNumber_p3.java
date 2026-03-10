import java.util.Scanner;

public class GuessingNumber_p3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

       int guessNUm = sc.nextInt();
       int Attempt = 0;

       while(guessNUm!= 1100){
        System.out.println("Guess the NUmber (1100): ");
        int num = sc.nextInt();
        Attempt++;
        
        
        if(num>guessNUm){
            System.out.println("Too high !");
            
        }
        else if(num<guessNUm){
            System.out.println("Too Low !!");
            
        }
        else {
            System.out.println("Correct !! Attempt : "+Attempt);
            break;
        }
       
       }
       sc.close();
    }
}
