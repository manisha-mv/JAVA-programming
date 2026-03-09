import java.util.Scanner;



public class onlineQuizScoreCal_p16 {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Pass_ct = 0;
        int fail_ct = 0;
        double total_score = 0.0;
        int max = 0;

        for(int i = 1;i<=n;i++){
            String name = sc.next();
            int crt_ans = sc.nextInt();
            int wrg_ans = sc.nextInt();
            int unattempt = sc.nextInt();

            int score = 0;
            String result = "";
            


            System.out.println();
            System.out.println("Student : "+name);
            System.out.println("Correct : "+crt_ans);
            System.out.println("Wrong : "+wrg_ans);
            System.out.println("Unattempted : "+unattempt);
            score = (crt_ans*4)-(wrg_ans*3)+(unattempt*0);
            System.out.println("Score : "+score);
             if(score>max){
                max = score;
            }
            if(score>=32){
                result = "PASS";
                Pass_ct++;
            }
            else{
                result = "FAIL";
                fail_ct++;
            }
            total_score+=score;
            System.out.println("Result : "+result);
            System.out.println();
           
        }
        System.out.println();
        System.out.println("Total Students :"+n);
        System.out.println("Pass Count  : "+Pass_ct);
        System.out.println("Fail Count : "+fail_ct);
        System.out.println("Class Average : "+total_score/n);
        System.out.println("Highest Score : "+max);
        System.out.println();
    }
}
