import java.util.Scanner;

public class p1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rating = sc.nextInt();
        int year_service = sc.nextInt();
        String Department = sc.next();
        double base_salary = sc.nextDouble();
        String Status;

        double bonus = 0.0;
        int bonus_percen = 0;

        if(rating>=3){
            Status = "Eligible";
            if(Department.equals("Critical")){
                if(rating==5 && year_service>=5){
                    bonus_percen = 25;
                }
                else if(rating==4 && year_service>=10){
                    bonus_percen = 22;
                }
                else if(rating==4){
                    bonus_percen = 15;
                }
                else{
                    bonus_percen = 10;
                }
            }
            else{
                if(rating==5){
                    bonus_percen =  18;
                }
                else if(rating==4){
                    bonus_percen = 12;
                }
                else{
                    bonus_percen= 8;
                }
            }
            bonus = (base_salary*bonus_percen)/100;
        }
        else{
            Status = "Not Eligible";
        }
        System.out.println("Performance Rating : "+rating);
            System.out.println("Years Of Service : "+year_service);
            System.out.println("Department : "+Department);
            System.out.println("Bonus percentage :"+bonus_percen+"%");
            System.out.println("base Salary : "+base_salary);
            System.out.println("Bonus Amt :$ "+bonus);
            System.out.println("Status : "+Status);
        sc.close();
    }
}
