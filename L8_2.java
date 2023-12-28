public class L8_2 {
    public static void main(String[] args) {
        byte b =56;
        char c ='a';
        short s =1024;
        int i =50000;
        float f=5.67f;
        double d=0.123456;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        //float + int - double = double
        System.out.println(result);
    }
}
