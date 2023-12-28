import java.util.Scanner;

public class L9_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter the operation which you want to perform or Press x or X to exit");
            char ch=sc.next().trim().charAt(0);
            if (ch=='*'||ch=='/'||ch=='+'||ch=='-'||ch=='%'){
                System.out.println("Enter the two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                if (ch=='*'){
                    System.out.println(a*b);
                }
                else if (ch=='/'){
                    if (b!=0){
                    System.out.println(a/b);}
                }
                else if (ch=='+'){
                    System.out.println(a+b);
                }
                else if (ch=='-'){
                    System.out.println(a-b);
                }
                else if (ch=='%'){
                    System.out.println(a%b);
                }
            } else if (ch=='x'||ch=='X') {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            else {
                System.out.println("Invalid Input!");
            }
        }
    }
}
