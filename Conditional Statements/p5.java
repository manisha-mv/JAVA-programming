import java.util.Scanner;

public class p5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double f_income = sc.nextDouble();
        int extra_curricular = sc.nextInt();
        String S_type = sc.next();

        String status = " Not Eligible";
        double awd_amt = 0.0;
        String awd_cate = "None";

        if(gpa>=2.5){
            // status = "Eligible";
            if(S_type.equals("Merit")){
                if(gpa>=3.8 && extra_curricular>=80){
                    status = "Eligible";
                    awd_cate = "Full";
                    awd_amt = 25000;
                }
                else if(gpa>=3.5 && extra_curricular>=70){
                    status = "Eligible";
                    awd_cate ="Partial";
                    awd_amt = 15000;
                }
                else if(gpa>=3.0 && extra_curricular>=60){
                    status = "Eligible";
                    awd_cate = "Minimal";
                    awd_amt = 8000;
                }
                // else{
                //     awd_amt = 0.0;
                //     awd_cate = "None";
                // }
            }
            else if(S_type.equals("Need-Based")){
                if(f_income<=30000 && gpa>=3.5){
                    status = "Eligible";
                    awd_cate = "Full";
                    awd_amt = 30000;
                }
                else if(f_income<=50000 && gpa>=3.0){
                    status = "Eligible";
                    awd_cate = "Partial";
                    awd_amt = 18000;
                }
                else if(f_income<=70000 && gpa>=2.8){
                    status = "Eligible";
                    awd_cate ="Minimal";
                    awd_amt=10000;
                }
                // else{
                //     awd_amt = 0.0;
                //     awd_cate = "None";
                // }
            }
            else if(S_type.equals("Sports")){
                if(extra_curricular>=85 && gpa>=3.0){
                    status = "Eligible";
                    awd_cate = "Full";
                    awd_amt = 22000;
                }
                else if(extra_curricular>=75 && gpa>=2.8){
                    status = "Eligible";
                    awd_cate = "Partial";
                    awd_amt = 20000;
                }
                else if(extra_curricular>=65 && gpa>=2.5){
                    status = "Eligible";
                    awd_cate = "Minimal";
                    awd_amt = 12000;
                }
                // else{
                //     awd_amt = 0.0;
                //     awd_cate = "None";
                // }
            }
            else {
                status = "Not Eligible";
                awd_amt = 0.0;
                awd_cate = "None";
            }
        }
        else{
            status = "Not Eligible";
        }
        System.out.println("GPA : "+gpa);
        System.out.println("Family Income : "+"$"+f_income);
        System.out.println("Extracurricular Score : "+extra_curricular);
        System.out.println("Scholarship Type : "+S_type);
        System.out.println("Eligibility : "+status);
        System.out.println("Award Amount : "+"$"+awd_amt);
        System.out.println("Award Category : "+awd_cate);
        sc.close();
    }
}