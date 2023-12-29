import java.util.Arrays;

public class L11_PassByValue {
    static void changeArray(int[] arr){
        arr[0]=15;
    }
    static void changeString(String s){
        s="Hi";
    }
    public static void main(String[] args) {
        String obj=new String("Hello");
        changeString(obj);
        int[] yo={5,20,15};
        changeArray(yo);
        System.out.println(obj);
        System.out.println(Arrays.toString(yo));

    }
}
