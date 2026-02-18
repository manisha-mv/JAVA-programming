import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int genpass  = scanner.nextInt();
        int genfare = scanner.nextInt();
        int acpass = scanner.nextInt();
        int acfare = scanner.nextInt();
        int platfrm = scanner.nextInt();
        int maintain = scanner.nextInt();
        int fuel = scanner.nextInt();

        int Revenue = (genpass*genfare)
                        +(acpass*acfare)
                        +platfrm
                        -maintain
                        -fuel;
        System.out.println("Total Transport Fee = " + Revenue);

        scanner.close();
    }
}

