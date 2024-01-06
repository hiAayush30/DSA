public class L13_MinNumber {
    public static void minNumber(int[] yo){
        if (yo.length==0){
            System.out.println("No input");
            return;
        }
        int min=yo[0];
        for (int i = 0; i <yo.length ; i++) {
            if (yo[i]<min){
                min=yo[i];
            }
        }
        System.out.println("The minimum number is "+min);
    }
    public static void main(String[] args) {
        int[] arr={50,40,30,20,10};
        minNumber(arr);
    }
}
