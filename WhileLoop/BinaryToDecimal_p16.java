import java.util.Scanner;

public class BinaryToDecimal_p16{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int originalBinary = binary;

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int)Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Binary: " + originalBinary);
        System.out.println("Decimal: " + decimal);
    }
}