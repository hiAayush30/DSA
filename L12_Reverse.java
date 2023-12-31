import java.util.Arrays;

public class L12_Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10,50};
        rev(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    public static void rev(int[] yo){
//        for (int i = 0; i<=yo.length/2 ; i++) {
//            int temp=yo[i];
//            yo[i]=yo[yo.length-1-i];
//            yo[yo.length-1-i]=temp;
//       }
//    }

    //or
    public static void rev(int[] yo,int starti,int endi) {
        while (starti<endi){
            if (endi==yo.length){
                endi--;
            }
            int temp=yo[starti];
            yo[starti]=yo[endi];
            yo[endi]=temp;
            starti++;
            endi--;
        }
    }
}

