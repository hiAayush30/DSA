import java.util.Arrays;

public class L13_2DArraySearch {
    public static int[] arraySearch(int[][] yo,int target){
        for (int i = 0; i <yo.length ; i++) {
            for (int j = 0; j <yo[i].length ; j++) {
                if (yo[i][j]==target){
                    return new int[] {i,j};    //writing like this as the array is not initialized
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={
                {2,8,10},
                {12,15,18,21}
        };
        int[] ans=arraySearch(arr,25);
        System.out.println(Arrays.toString(ans));
    }
}
