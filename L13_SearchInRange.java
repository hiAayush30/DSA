public class L13_SearchInRange {
    public static void main(String[] args) {
        int[] arr={3,14,12,-7,3,28};
        //Search for 3 in the range of index 1 to 4
        for (int i = 1; i <5 ; i++) {
            if (arr[i]==3){
                System.out.println("Number found at index "+i);
            }
        }
    }
}
