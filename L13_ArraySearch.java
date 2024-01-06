public class L13_ArraySearch {
    public static void main(String[] args) {
        int[] arr={18,14,12,9,77,50};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==14){
                System.out.println("The number is present at index "+i);
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Number not found in the array!");
        }

        //Using for-each
//        for (int element:arr ){
//            if (element==14){
//                System.out.println("Number found!");
//                count++;
//            }
//        }
//        if (count==0){
//            System.out.println("Number not found in the array!");
//        }
    }
}
