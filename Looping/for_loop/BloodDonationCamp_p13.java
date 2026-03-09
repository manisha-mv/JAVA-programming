import java.util.Scanner;

public class BloodDonationCamp_p13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Eligible_ct = 0;
        int not_eligible_ct = 0;
        double eligible_rate = 0.0;

        for(int i = 1;i<=n;i++){
            String donor_name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemo = sc.nextDouble();

            String status = "";
            System.out.println();
            System.out.println("Donor : "+donor_name);
            System.out.println("Age : "+age+"years");
            System.out.println("Weight : "+weight+"kg");
            System.out.println("Hemoglobin : "+hemo+"g/dl");
            if((age>=18 && age<=65) && (weight>=50) && (hemo>=12.5)){
                status = "Eligible";
                Eligible_ct++;
            }
            else {
                status = "Not Eligible";
                not_eligible_ct++;
            }
            System.out.println("Status : "+status);
            System.out.println();
            eligible_rate = (Eligible_ct/n)*100;
        }
        System.out.println();
        System.out.println("Total Donor : "+n);
        System.out.println("Eligible Donors : "+Eligible_ct);
        System.out.println("Rejected Donors : "+not_eligible_ct);
        System.out.printf("Eligiblity Rate : %.2f%%\n ",eligible_rate);
        System.out.println();
        sc.close();
    }
}
