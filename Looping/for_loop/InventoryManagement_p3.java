import java.util.Scanner;

public class InventoryManagement_p3 {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);

        int n = sc.nextInt();
        // String status = "";
        // int  reorder = 0;
        int lowCount = 0;
        int CriticalCount = 0;
        int totalReorder = 0;


        for(int i = 1;i<=n;i++){

            String product = sc.next();
            int current_stock = sc.nextInt();
            int mini_stock = sc.nextInt();

            String status = "";
            int reorder = 0;


            if(current_stock>=mini_stock){
                status = "Adequate";
                reorder = 0;

            }
            else if(current_stock>=mini_stock/2){
                status = "Low Stock";
                reorder = (mini_stock-current_stock)+5;
                lowCount++;
            }
            else if(current_stock<mini_stock/2){
                status = "Critical";
                reorder = (2*mini_stock)-current_stock;
                CriticalCount++;
            }

            // if (status.equals("Low Stock")){
            //     reorder = (2*mini_stock)-current_stock;
            // }
            // else if(status.equals("Critical")){
            //     reorder = (2*mini_stock)-current_stock;
            // }


            totalReorder +=reorder;
            System.out.println();
            System.out.println("Product : "+product);
            System.out.println("Current Stock : "+current_stock);
            System.out.println("Minimum Stock : "+mini_stock);
            System.out.println("Status : "+status);
            System.out.println("Reorder Quantity "+reorder);

            // totalReorder = lowCount+CriticalCount;

        }

        System.out.println();
        System.out.println("After all Products :");
        System.out.println();
        System.out.println();
        System.out.println("Total Products : "+n);
        System.out.println("Low Stock Items : "+lowCount);
        System.out.println("Critical Items :"+CriticalCount);
        System.out.println("Total Reoreder Quantity : "+totalReorder);

        sc.close();


    }
}

