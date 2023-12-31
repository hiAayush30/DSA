import java.util.Arrays;

public class L12_Swap {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,10};
        swap(arr,3,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] yo,int i1,int i2){
        int temp=yo[i1];
        yo[i1]=yo[i2];
        yo[i2]=temp;
    }
}

