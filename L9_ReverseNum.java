import java.util.Scanner;

public class L9_ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int count =0;
//        int num=n;
//        while (num!=0){
//            count++;
//            num /=10;
//        }
//        int reversed=0;
//        while (count != 0) {
//            int temp=n%10;
//            int count2=count;
//            int q=1;
//            while (count2!=1){
//                q*=10;
//                count2--;
//            }
//            reversed=reversed+temp*q;
//            count--;
//            n/=10;
//        }
//        System.out.println(reversed);

        int num=n;
        int result=0;
        while (num!=0){
            int temp=num%10;
            result=result*10+temp;
            num/=10;
        }
        System.out.println(result);
    }
}
