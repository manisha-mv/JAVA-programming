import java.util.Scanner;

class p3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int sales = sc.nextInt();
        int Disct = sc.nextInt();
        int Gst = sc.nextInt();

        int disct_rate = sales -(sales*Disct/100);
        int GST_rate = disct_rate*Gst/100;
        int total_revenue = disct_rate+GST_rate;

        System.out.println("Total  Revenue : "+total_revenue);
        sc.close();
    }
}