import java.util.Arrays;

public class L13_StringSearch {
//    public  static void findString(String yo,char target){
//        if(yo.isEmpty()){        //or yo.length()==0
//            System.out.println("No input");
//            return;
//        }
//        for (int i = 0; i <yo.length() ; i++) {
//            if (target == yo.charAt(i)) {
//                System.out.println("The letter is present at index "+i);
//                return;
//            }
//        }
//        System.out.println("Letter not found!");
//    }

    //for-each method
    public  static void findString(String yo,char target){
        for (char ch:yo.toCharArray()) {
            if (ch==target) {
                System.out.println("The letter is present!");
                return;
            }
        }
        System.out.println("the letter is not present!");
        return;
    }
    public static void main(String[] args) {
        String str="Aayush";
        System.out.println(Arrays.toString(str.toCharArray()));   //or sout(str.toCharArray())
        System.out.println(str.toCharArray());
        System.out.println(str);
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(arr));
       findString(str,'t');
    }
}
