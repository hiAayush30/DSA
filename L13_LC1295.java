public class L13_LC1295 {
    static int evenNumOfDigits(int[] yo){
     int numCount=0;
        for (int i = 0; i <yo.length ; i++) {
            int rem=yo[i];
            int count=0;
            while (rem!=0){
                count++;
                rem/=10;
            }
//            //or
//            if (yo[i]<0){
//                yo[i]*=-1;
//            }
//            int count=(int)(Math.log10(yo[i])+1);
            if (count%2==0 && count!=0){
                numCount++;
            }
        }
        return numCount;
    }
    public static void main(String[] args) {
        int[] arr={18,124,9,1764,98,1,-34};
       System.out.println("The total numbers with even number of digits are "+evenNumOfDigits(arr));

    }
}
//best solution
//class Solution {
//    public int findNumbers(int[] nums) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            int num = nums[i];
//            int digits =0;
//            while(num>0){
//       //   int rem = num % 10;
//                digits++;
//                num = num/10;
//            }
//            if(digits%2==0){
//                count++;
//            }
//        }
//        return count;
//    }
//}
