import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total_salary = scanner.nextInt();
        int session = scanner.nextInt();
        int per_session_rate = scanner.nextInt();
        int bonus = scanner.nextInt();
        int maintain = scanner.nextInt();

        int final_salary =total_salary + (session*per_session_rate) 
                            +bonus
                            -maintain;

        System.out.println("Final Salary = " + final_salary);

        scanner.close();
    }
}
