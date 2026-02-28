import java.util.Scanner;


public class loanapproval{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int credit_score = sc.nextInt();
        double A_income = sc.nextDouble();
        double ratio = sc.nextDouble();
        String type = sc.next();

        String Decision = "";
        double max_amt = 0.0;

        if(credit_score<600 || ratio>=50){
            Decision = "Rejected";
        }
        else{

            if(type.equals("Home")){
            if((credit_score>=750) && (ratio<=30)){
                Decision = "Approved";
                max_amt = 4*A_income;
            }
            else if((credit_score>=700 && credit_score<=749) && (ratio>=31 && ratio<=40)){
                Decision = "Needs Reveiw";
                max_amt = 3*A_income;
            }
        }
        else if(type.equals("Personal")){
            if((credit_score>=750) && (ratio<=30)){
                Decision = "Approved";
                max_amt = 1*A_income;
            }
            else if((credit_score>=650 && credit_score<=699) && (ratio>=31 && ratio<=40)){
                Decision = "Needs Review";
                max_amt = 0.5*A_income;
            }
        }
        else if(type.equals("Business")){
            if((credit_score>=750)|| (credit_score>=700 && credit_score<=749) && 
            (ratio<=30 || (ratio>=31 && ratio<=40))){
                Decision = "Approved";
                max_amt = 3*A_income;
            }
        }
        }
        System.out.println("");
        System.out.println("======Loan Approval Notice======");
        System.out.println();


        System.out.println("Credit Score : "+credit_score);
        System.out.println("Annual Income : $"+A_income);
        System.out.println("Debt-to-Income Ratio: "+ratio+" %");
        System.out.println("Loan Type : "+type);
        System.out.println("Decision : "+Decision);
        System.out.println("Maximum Loan Amount : $"+max_amt);

        sc.close();
    }
}
