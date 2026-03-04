import java.util.Scanner;

public class mobileDataPlan_p25{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        double dataGB = sc.nextDouble();
        int call_min = sc.nextInt();
        String Internet_usage = sc.next();
        String device_type = sc.next();

        String Recom_plan = "";
        String plan_cate = "";
        int base_cost = 0;
        
        double data_over = 0.0;
        double  call_over = 0.0;
        double inter_fee = 0.0;
        double device_fee = 0.0;
        String higher_plan = "";
        int higher_base_cost = 0;


        if(dataGB<=2.0){
            if(call_min<=500){
                if(Internet_usage.equals("None") && (device_type.equals("Basic"))){
                    Recom_plan = "Basic 2GB";
                    plan_cate = "Budget";
                    base_cost = 25;
                }
            }
        }
        else if(dataGB>2.0 && dataGB<=6.0){
            Recom_plan = "Standard 5GB";
            plan_cate = "Standard";
            base_cost = 40;
        }
        else if(dataGB>30.0){
            Recom_plan = "Unlimited Max";
            plan_cate = "Unlimited";
            base_cost =90;
        }

        if(Internet_usage.equals("Heavy")){
            Recom_plan ="Unlimited Max";
        }
        else if(device_type.equals("Hotspot")){
            Recom_plan = "Unlimited Max";
        }
        else if(Internet_usage.equals("Moderate")){
            Recom_plan = "Premium Unlimited";
        }

        if(Recom_plan.equals("Basic 2GB")){
            if(dataGB>2){
                if(call_min>500){
                    call_over = (call_min-500)*10.0; 
                }
                data_over = (dataGB-2)*10;
            }
            plan_cate = "Budget";
        }
        else if(Recom_plan.equals("Standard 5GB")){
            if(dataGB>5){
                if(call_min>1000){
                    call_over = (call_min-1000)*0.05;
                }
                data_over = (dataGB-5)*10;
            }
            plan_cate = "Standard";
        }
        else if(Recom_plan.equals("Unlimited Max") || (Recom_plan.equals("Premium Unlimited"))){
            data_over = 0.0;
            plan_cate = "Unlimited";
        }
        else{
            data_over = 0.0;
            plan_cate = "Premium";
        }

        if(Internet_usage.equals("None")){
            inter_fee = 0.0;
        }
        else if(Internet_usage.equals("Light")){
            inter_fee = 5.0;
        }
        else if(Internet_usage.equals("Moderate")){
            inter_fee = 15.0;
        }
        else if(Internet_usage.equals("Heavy")){
            inter_fee = 30.0;
        }

        if(device_type.equals("Basic")){
            device_fee = 0.0;
        }
        if(device_type.equals("Smartphone")){
            device_fee = 10.0;
        }
        if(device_type.equals("Tablet")){
            device_fee = 10.0;
        }
        if(device_type.equals("Hotspot")){
            device_fee = 20.0;
        }
        double total_cost = base_cost+data_over+call_over
                            +inter_fee+device_fee;

            // if(Recom_plan.equals("Basic 2GB")){
            //     higher_plan = "Standard";
            //     higher_base_cost = 40;
            // }
            // else if(Recom_plan.equals("Standard 5GB")){
            //     higher_plan = "Premium Unlimited";
            //     higher_base_cost = 70;
            // }
            // else if(Recom_plan.equals("Premium Unlimited")){
            //     higher_plan = "Unlimited Max";
            //     higher_base_cost = 90;
            // }
            // else{
            //     higher_plan = "";
            // }
        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + call_min + " minutes");
        System.out.println("International Usage: " + Internet_usage);
        System.out.println("Device Type: " + device_type);
        System.out.println("Base plan Cost: " + base_cost);
        System.out.println("Data Overage: $" + data_over);
        System.out.println("Call Overage: $" + call_over);
        System.out.println("International Fee: $" + inter_fee);
        System.out.println("Device Fee: $" + device_fee);
        System.out.println("Total Monthly Cost: $" + total_cost);
        System.out.println("Plan Category: " + plan_cate);

        sc.close();
    }
}
