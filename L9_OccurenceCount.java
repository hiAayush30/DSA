import java.util.Scanner;

public class L9_OccurenceCount {
    public static void main(String[] args) {
        //number of times a particular digit appears in a number
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            int n=num%10;
            if (n==7){
                count++;
            }
            num /=10;
        }
        System.out.println(count);
    }
}
