import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        sc.nextLine(); // consume newline
        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();

        int bondPercentage = 100 - stockPercentage;
        int riskScore = stockPercentage; // Base risk score

        // 1. Adjust risk based on investment horizon
        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } else if (investmentYears <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } else if (investmentYears <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }
        // 21+ years → No adjustment

        // 2. Adjust risk based on market volatility
        if (marketVolatility.equals("Low")) {
            riskScore += 0;
        } else if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }

        // Limit score to 100
        if (riskScore > 100) {
            riskScore = 100;
        }

        // 3. Determine risk category
        String riskCategory = "";
        if (riskScore <= 30) {
            riskCategory = "Low";
        } else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } else if (riskScore <= 80) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        // 4. Check alignment with risk tolerance
        String alignmentStatus = "";
        String recommendation = "";
        String rebalancing = "";

        if (riskTolerance.equals("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Risk slightly above conservative level";
                rebalancing = "Consider minor reduction in stocks";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            }
        }

        else if (riskTolerance.equals("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            } else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio risk is slightly away from target";
                rebalancing = "Minor portfolio adjustments may improve balance";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Risk level too high for moderate tolerance";
                rebalancing = "Reduce stock allocation gradually";
            }
        }

        else if (riskTolerance.equals("Aggressive")) {
            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignmentStatus = "Well Aligned";
                if (riskCategory.equals("Very High") && investmentYears >= 15) {
                    alignmentStatus = "Acceptable";
                    recommendation = "High risk level acceptable given long horizon and tolerance";
                    rebalancing = "Monitor closely, consider slight reduction if volatility persists";
                } else {
                    recommendation = "Portfolio is appropriately balanced for your profile";
                    rebalancing = "No action needed";
                }
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio slightly conservative for aggressive profile";
                rebalancing = "Consider increasing stock allocation";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalancing = "Increase stocks to 80-90% for better growth potential";
            }
        }

        // Output
        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalancing);

        sc.close();
    }
}
