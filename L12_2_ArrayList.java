import java.util.ArrayList;
import java.util.Scanner;

public class L12_2_ArrayList {
    public static void main(String[] args) {
            //Syntax
        ArrayList<Integer> list=new ArrayList<>(3);
     list.add(67);
     list.add(7);
     list.add(77);
     list.add(72);
     list.add(67);
     list.add(56);
     System.out.println(list);
        System.out.println(list.contains(67));
     list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            list.add(sc.nextInt());
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  //list[index] will not work here
        }
    }
}
