import java.util.Scanner;

public class Electricity_bill_cal_p7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total_units = 0;
        double total_revenue = 0.0;
        double average = 0.0;


        for(int i = 1;i<=n;i++){
            String consumer_ID = sc.next();
            int unit_consume = sc.nextInt();
            sc.nextLine();

            double bill_amt = 0.0;
            String category = "";

            if(unit_consume<=100){
                bill_amt = unit_consume*0.10;
            }
            else if(unit_consume<=200){
                bill_amt = (100*0.10)+((unit_consume-100)*0.13);
            }
            else if(unit_consume<=300){
                bill_amt = (100*0.10)+(100*0.13)+((unit_consume-200)*0.16);
            }
            else {
                bill_amt = (100*0.10)+(100*0.13)+(100*0.16)+((unit_consume-300)*0.20);
            }
            System.out.println();
            System.out.println("Consumer ID : "+consumer_ID);
            System.out.println("Units Consumed : "+unit_consume);
            System.out.println("Bill Amount :$ "+bill_amt);
            if(unit_consume<=200){
                category = "Low Usage";
            }
            else if(unit_consume>=201 && unit_consume<=300){
                category = "Medium Usage";
            }
            else if(unit_consume>300){
                category = "High Usage";
            }
            System.out.println("Category : "+category);
            System.out.println();
            total_units+=unit_consume;
            total_revenue+=bill_amt;

        }
        average = total_revenue/n;
        System.out.println();
        System.out.println("Total Consumers : "+n);
        System.out.println("Total Units : "+total_units);
        System.out.println("Total Revenue : "+total_revenue);
        System.out.println("Average : "+average);
        sc.close();
    }
}
