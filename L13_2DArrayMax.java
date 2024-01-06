import java.util.Arrays;

public class L13_2DArrayMax {
    public static int arraySearch(int[][] yo,int target){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <yo.length ; i++) {
            for (int j = 0; j <yo[i].length ; j++) {
                if (yo[i][j]>max){
                    max=yo[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr={
                {2,8,10},
                {12,15,18,21}
        };
        int ans=arraySearch(arr,25);
        System.out.println(ans);
    }
}
