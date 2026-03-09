import java.util.Scanner; 

public class LibraryFineCal_p14 {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double total_fines = 0.0;
     int ct = 0;

    for(int i = 1;i<=n;i++){
        String book_type = sc.next();
        int days_late = sc.nextInt();

        double daily_fine = 0.0;
        double calculated_fine = 0.0;
        double actual_fine = 0.0;
        double cap = 0.0;
        String cap_applied = "";
       
      

        System.out.println();
        System.out.println("Book "+i+" : "+book_type);
        System.out.println("Days Late :"+days_late);
        if(book_type.equals("Regular")){
            daily_fine = 0.50;
            cap = 1.0;
        }
        else if(book_type.equals("Reference")){
            daily_fine = 1.0;
            cap = 2.0;
        }
        else if(book_type.equals("Magazine")){
            daily_fine = 0.25;
            cap = 0.5;
        }
        System.out.println("Daily Fine : $"+daily_fine);
        calculated_fine = daily_fine*days_late;
        if(calculated_fine>cap){
            actual_fine = cap;
            cap_applied = "YES";
        }
        else {
            actual_fine = calculated_fine;
            cap_applied = "NO";
        }
        System.out.println("Calculated Fine : $"+calculated_fine);
        System.out.println("Actual Fine : $"+actual_fine);
        System.out.println("Cap Applied : $"+cap_applied);
        System.out.println();
        if(days_late>0){
            ct++;
        }
        total_fines +=actual_fine;
    }
    System.out.println();
    System.out.println("Total Books : "+n);
    System.out.println("Total Fines Collected : $"+total_fines);
    System.out.println("Book Overdue : "+ct);
    System.out.println("Avearge Fine : $"+total_fines/ct);
    System.out.println();
    sc.close();
   }
}