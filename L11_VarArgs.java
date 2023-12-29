import java.lang.reflect.Array;
import java.util.Arrays;

public class L11_VarArgs {
    public static void printArray(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //Variable length argument must be at last
    static  void varArgs2(int a,int b,String ...yo){
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(yo));
    }
    public static void main(String[] args) {
      printArray(2,3,4,5,6,7,8);
      varArgs2(4,5,"hello","my","name","is","Spiderman");
//      int a=2;
//      //int b=++a;
//       int c=a++;
//        System.out.println(c);
//        System.out.println(a);
    }
}
