import java.util.Scanner;

public class EmployeeSalary_p1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter no. of employee : ");

        int n = sc.nextInt();
        double final_salary = 0.0;
        double Payroll = 0.0;
        double average_salary = 0.0;

        for(int i =1;i<=n;i++){
                // System.out.print("Enter the name : ");
                String name= sc.next();
                // System.out.print("Enter the salary : ");
                double salary =  sc.nextDouble();
                // System.out.print("Enter the Rating : ");
                int rating = sc.nextInt();
                System.out.println();
                

                int increment_rating = 0;

                if(rating==5){
                    increment_rating = 15;
                }
                else if(rating==4){
                    increment_rating = 10;
                }
                else if(rating==3){
                    increment_rating = 5;
                }
                else if(rating==2){
                    increment_rating = 2;
                }
                else {
                    increment_rating = 0;
                }

                final_salary = salary + (salary*(increment_rating/100.0));

                System.out.println("Employee : "+name);
                System.out.println("Base Salary : $"+salary);
                System.out.println("Increament Rating : "+rating);
                System.out.println("Performance Rating : "+increment_rating+"%");
                System.out.println("Final salary : $"+final_salary);
                System.out.println();

                Payroll+=final_salary;
        }
        
        average_salary =Payroll/n;
        System.out.println();
        System.out.println("Total Employees Processed : "+n);
        System.out.println("Total Payroll : $"+Payroll);
        System.out.printf("Average Salary : $%.2f",average_salary);
        sc.close();
    }
    
}

