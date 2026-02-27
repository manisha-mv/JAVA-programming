import java.util.Scanner;

public class CollegeResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        int chemistry = sc.nextInt();

        int total = maths + physics + chemistry;

        if (maths < 40 || physics < 40 || chemistry < 40) {
            System.out.println("Result: Fail (Minimum 40 marks required in each subject)");
        } 
        else if (total >= 250) {
            System.out.println("Result: Distinction");
            System.out.println("Total Marks: " + total);
        } 
        else if (total >= 180) {
            System.out.println("Result: First Class");
            System.out.println("Total Marks: " + total);
        } 
        else {
            System.out.println("Result: Pass");
            System.out.println("Total Marks: " + total);
        }

        sc.close();
    }
}