import java.util.Arrays;
import java.util.Scanner;

public class L12_1_Arrays {
    public static void main(String[] args) {
        //array of objects
        String[] str= new String[3];
        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i <3 ; i++) {
//            str[i]=sc.nextLine();
//        }
//        System.out.println(Arrays.toString(str));

        //2D arrays can be of variable sizes
//        int[][] arr ={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
//        System.out.println(Arrays.toString(arr[0]));

        //Taking input for 2D array
        int[][] arr2= {
                {0,0},{0,0,0},{0,0,0,0}
        };
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                System.out.printf("Enter the number for [%d][%d]\n",i,j);
                arr2[i][j]=sc.nextInt();
            }
        }
//        for (int i = 0; i <arr2.length ; i++) {
//            for (int j = 0; j <arr2[i].length ; j++) {
//                System.out.print(arr2[i][j]+", ");
//            }
//            System.out.println();
//        }
        //or
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        //or
        for (int[] a:arr2) {
           System.out.println(Arrays.toString(a));   //as now every element is an array itself
        }
    }
}
