import java.util.Scanner;

public class StudentGrade_p2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        String grade = "";
        String status = "";
        double total = 0.0;
        int max = 0;
        int pass_count = 0;
        int fail_count =0;

        for(int i = 1;i<=n;i++){
            String name = sc.next();
            int score = sc.nextInt();

            if(score>=85 && score<=100){
                grade = "A";
            }
            else if(score>=70 && score<=84){
                grade = "B";
            }
            else if(score>=60 && score<=69){
                grade = "C";
            }
            else if(score>=50 && score<=59){
                grade = "D";
            }
            else {
                grade = "F";
            }

            if(score>=60){
                status = "Pass";
                pass_count++;

            }
            else{
                status = "Fail";
                fail_count++;
            }

            max = Math.max(max,score);            

            System.out.println();
            System.out.println("Student : "+name);
            System.out.println("Score : "+score);
            System.out.println("Letter Grade : "+grade);
            System.out.println("Status : "+status);

            total +=score/n;

        }
        System.out.println();
        System.out.println("Total Students : "+n);
        System.out.println("Class Average : "+total);
        System.out.println("Highest Score : "+max);
        System.out.println("Students Passed : "+pass_count);
        System.out.println("Student Failed : "+fail_count);

        sc.close();
    }
}


