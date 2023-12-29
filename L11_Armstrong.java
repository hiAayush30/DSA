public class L11_Armstrong {
//    static void printArmstrong(){
//        System.out.println("The Armstrong numbers are");
//        for (int i=100;i<=999;i++){
//            int temp=i;
//            int a,b,c;
//            a=temp%10;
//            temp/=10;
//            b=temp%10;
//            c=temp/10;
//            if (a*a*a+b*b*b+c*c*c==i){
//                System.out.print(i+", ");
//            }
//        }
//    }
    public static void main(String[] args) {
//        printArmstrong();
        for (int i=100;i<=999;i++){
            if (isArmstrong(i)){
                System.out.print(i+", ");
            }
        }
    }
    static boolean isArmstrong(int n){
     int num=n;
     int sum=0;
     while(n>0){
         int rem=n%10;
         sum+=rem*rem*rem;
         n/=10;
     }
     return sum==num;
    }
}
