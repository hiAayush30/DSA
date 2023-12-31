import java.util.ArrayList;
import java.util.Scanner;

public class L12_3_MultiD_Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //initialization
//        for (int i = 0; i < 3; i++) {             //3 lists added within the list
//            list.add(new ArrayList<>());
//        }

        //add elements
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {               //3 lists inside the list
            for (int j = 0; j < 4; j++) {           //adding 4 elements in each list
                list.get(i).add(sc.nextInt());      //get the list within the list and add the entered number
            }
        }

        System.out.println(list);

        //to get any element
        System.out.println(list.get(0).get(0));
    }
}
