import java.util.Scanner;

public class L9_LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int largest=a;
//        if (b>largest){
//            largest=b;
//        } else if (c>largest) {
//            largest=c;
//        }
//        System.out.println("The largest number is "+largest);

        //or
        int max=Math.max(Math.max(a,b),c);
        System.out.println("The largest number is "+max);
    }
}
