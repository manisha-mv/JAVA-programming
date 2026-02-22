import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = 0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0;
        String deliveryTime = "";
        String serviceLevel = "";

        // 1️⃣ Base Rate by Shipping Speed
        if (shippingSpeed.equals("Economy")) {
            baseRate = 5;
            serviceLevel = "Budget";
        } else if (shippingSpeed.equals("Standard")) {
            baseRate = 10;
            serviceLevel = "Standard";
        } else if (shippingSpeed.equals("Express")) {
            baseRate = 25;
            serviceLevel = "Priority";
        } else if (shippingSpeed.equals("Overnight")) {
            baseRate = 50;
            serviceLevel = "Premium";
        }

        // 2️⃣ Weight Surcharge ($1 per pound)
        weightSurcharge = packageWeight * 1;

        // 3️⃣ Zone Multiplier
        if (destinationZone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if (destinationZone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (destinationZone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if (destinationZone.equals("International")) {
            zoneMultiplier = 3.0;
        }

        // 4️⃣ Size Surcharge
        if (packageSize.equals("Small")) {
            sizeSurcharge = 0;
        } else if (packageSize.equals("Medium")) {
            sizeSurcharge = 5;
        } else if (packageSize.equals("Large")) {
            sizeSurcharge = 15;
        } else if (packageSize.equals("Oversized")) {
            sizeSurcharge = 30;
        }

        // 5️⃣ Cost Calculation
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;

        // 6️⃣ Delivery Time (Nested if-else)
        if (shippingSpeed.equals("Economy")) {
            if (destinationZone.equals("Local")) {
                deliveryTime = "7 business days";
            } else if (destinationZone.equals("Regional")) {
                deliveryTime = "7 business days";
            } else if (destinationZone.equals("National")) {
                deliveryTime = "7 business days";
            } else {
                deliveryTime = "14 business days";
            }
        } 
        else if (shippingSpeed.equals("Standard")) {
            if (destinationZone.equals("Local")) {
                deliveryTime = "5 business days";
            } else if (destinationZone.equals("Regional")) {
                deliveryTime = "5 business days";
            } else if (destinationZone.equals("National")) {
                deliveryTime = "5 business days";
            } else {
                deliveryTime = "10 business days";
            }
        } 
        else if (shippingSpeed.equals("Express")) {
            if (destinationZone.equals("Local")) {
                deliveryTime = "2 business days";
            } else if (destinationZone.equals("Regional")) {
                deliveryTime = "2 business days";
            } else if (destinationZone.equals("National")) {
                deliveryTime = "2 business days";
            } else {
                deliveryTime = "3 business days";
            }
        } 
        else if (shippingSpeed.equals("Overnight")) {
            deliveryTime = "1 business days";
        }

        // Output
        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryTime);
        System.out.println("Service Level: " + serviceLevel);

        sc.close();
    }
}