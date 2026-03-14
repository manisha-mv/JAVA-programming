import java.util.Scanner;

public class Menu_driven_calsi_p7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Calculator Menu : ");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            int choice =0;
            
            
            
        do{
            System.out.print("choice : ");
            choice = sc.nextInt();
            if(choice>=1 && choice<=4){
            System.out.print("Enter the two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res  =0;
            if(choice==1){
                res = a+b;
            }
            else if(choice==2){
                res = a-b;
            }
            else if(choice==3){
                res = a*b;
            }
            else if(choice==4){
                res = a/b;
            }
            System.out.println("Result : "+res);
            }

        }while(choice!=5);
                System.out.println("Good Bye!!");
                sc.close();
            }
    }
