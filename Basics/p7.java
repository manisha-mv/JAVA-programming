import java.util.Scanner;

public class p7 {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            int day_work = sc.nextInt();
            int per_day =sc.nextInt();
            int bonus = sc.nextInt();
            int charge = sc.nextInt();

            int total_value = day_work*per_day;

            int total_salary = total_value+bonus;

            int final_wage = total_salary-charge;

            System.out.println("Total Wage : "+final_wage);
            sc.close();
    }
}
