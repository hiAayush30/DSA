public class L12_Max {
    public static void main(String[] args) {
        int[] arr={4,5,16,7,8,9};
        System.out.println(max(arr));
    }
    public static int max(int[] yo){
        int max=0;
        for (int i = 0; i <yo.length-1 ; i++) {
            if (yo[i]>max){
                max=yo[i];
            }
        }
        return max;
    }
}
