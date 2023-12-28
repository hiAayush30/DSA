import java.util.Scanner;

public class L9_Fibonacci {
    //Finding the nth fibonacci number
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//       if (n==0){
//           System.out.println(0);
//        }
//        if (n==1){
//            System.out.println(1);
//        }
//        int num=0;
//        for (int i = 0; i <= n-2; i++) {
//            num=a+b;
//            int temp=b;
//            b=num;
//            a=temp;
//        }
//        System.out.println(num);

        int count=2;
        while (count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
