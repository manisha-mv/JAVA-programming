import java.util.Scanner;

public class p2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtRatio = sc.nextDouble();
        String loanType = sc.next();

        String decision = "Rejected";
        double maxLoanAmount = 0.0;

       
        if (creditScore < 600 || debtRatio > 50) {
            decision = "Rejected";
            maxLoanAmount = 0.0;
        }
        else {

            
            String creditTier;

            if (creditScore >= 750)
                creditTier = "Excellent";
            else if (creditScore >= 700)
                creditTier = "Good";
            else if (creditScore >= 650)
                creditTier = "Fair";
            else
                creditTier = "Poor";

          
            String debtLevel;

            if (debtRatio <= 30)
                debtLevel = "Low";
            else if (debtRatio <= 40)
                debtLevel = "Moderate";
            else
                debtLevel = "High";

        

            if (loanType.equals("Home")) {

                if (creditTier.equals("Excellent") && debtLevel.equals("Low")) {
                    decision = "Approved";
                    maxLoanAmount = annualIncome * 4;
                }
                else if (creditTier.equals("Good") && debtLevel.equals("Moderate")) {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 3;
                }
                else {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 3;
                }
            }

            else if (loanType.equals("Personal")) {

                if (creditTier.equals("Excellent") && debtLevel.equals("Low")) {
                    decision = "Approved";
                    maxLoanAmount = annualIncome * 1;
                }
                else if (creditTier.equals("Fair") && debtLevel.equals("Moderate")) {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 0.5;
                }
                else {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 0.5;
                }
            }

            else { 

                if ((creditTier.equals("Excellent") || creditTier.equals("Good")) &&
                        (debtLevel.equals("Low") || debtLevel.equals("Moderate"))) {

                    decision = "Approved";
                    maxLoanAmount = annualIncome * 3;
                }
                else {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 2;
                }
            }
        }

        
        System.out.println("Credit Score: " + creditScore);
        System.out.printf("Annual Income: $%.1f\n", annualIncome);
        System.out.printf("Debt-to-Income Ratio: %.1f%%\n", debtRatio);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.printf("Maximum Loan Amount: $%.1f\n", maxLoanAmount);

        sc.close();
    }
}