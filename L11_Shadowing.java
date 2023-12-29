public class L11_Shadowing {
    static int x=23;  //This will get shadowed at line 6
    public static void main(String[] args) {
        System.out.println("x="+x);
        int x;
        //System.out.println(x); //Shadowing will begin only when the variable is initialised(declared)
        x=45;
        System.out.println("x="+x);
        fun();
        //Shadowing does not work in methods(like we are in main method)


//          int y=20;
//        System.out.println("y="+y);
//        {
//        System.out.println("y="+y);
//            y=50;
//            System.out.println("y="+y);
//        }
//        System.out.println("y="+y);

    }

    static void fun(){
        System.out.println(x);
        int x=60;
        System.out.println(x);

    }
}
