import java.util.Scanner;

public class p12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int file_size = sc.nextInt();
        int compression = sc.nextInt();

        int Compressed = file_size>>compression;
        System.out.println("Compressed Size = "+Compressed);
        sc.close();
    }
    
}
