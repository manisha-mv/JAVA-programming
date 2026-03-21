import java.util.Scanner;

public class VowelCOunter_p23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String sh = sc.nextLine();

        int i = 0;
        int count = 0;
         do{
             char ch = Character.toLowerCase(sh.charAt(i));
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
             }
             i++;
         }while(i<sh.length());

         System.out.println("Vowel : "+count);
    } 
}
