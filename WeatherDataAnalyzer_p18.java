import java.util.Scanner;

public class WeatherDataAnalyzer_p18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total_temp = 0.0;
        double high_temp = 0.0;
        double low_temp = 0.0;
        int hot_ct = 0;
        int Cold_ct = 0;
        int add1 =0;
        int add2 = 0;

        for(int i=1;i<=n;i++){
            int hr = sc.nextInt();
            double temp = sc.nextDouble();

            String status = "";

            System.out.println();
            System.out.println("Hour "+hr+" : "+temp+"°C");
            if(temp>=40.0 || temp<=0.0){
                status = "Extreme";
            }
            else if(temp>=32.0 && temp<=40.0){
                status = "Hot";
            }
            else if(temp>=0.0 && temp<=10.0){
                status = "Cold";
            }
            else if(temp>10.0 && temp<32.0){
                status = "Normal";
            }
            System.out.println("Status : "+status);
            System.out.println();
            total_temp+=temp;
            if(temp>high_temp){
                high_temp = temp;
                add1 = hr;
            }
            if(temp<low_temp){
                low_temp = temp;
                add2 = hr;
            }

            if(temp>=32){
                hot_ct++;
            }
            else if(temp<=10){
                Cold_ct++;
                // add2 = hr;
            }

        }
        System.out.println();
        System.out.println("Total Readings : "+n);
        System.out.printf("Average Temperature : %.2f°C\n",total_temp/n);
        System.out.println("Highest Temperature : "+high_temp+" at Hour "+add1);
        System.out.println("Lower Temperature : "+low_temp+" at Hour "+add2);
        System.out.println("Hot Hours : "+hot_ct);
        System.out.println("Cold Hours : "+Cold_ct);
        System.out.println();
    }

}
