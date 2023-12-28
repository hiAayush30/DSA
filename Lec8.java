import java.util.Scanner;

public class Lec8 {
    public static void main(String[] args) {

        //Typecasting (narrowing)
        int num =(int)(56.7f);
        System.out.println(num);

        //Automatic Type promotion in expressions
        int a=257;
        byte b=(byte)(a);  //as 257 beyond its range,it will store the remainder ie a%maxvalue =257/256
        System.out.println(b);

        byte x=40;
        byte y=50;
        byte z=100;
        int result=x*y/z;
        System.out.println(result);
        //as x*y is beyond the byte's storage capacity,java is automatically promotes each byte/short to int while evaluating -
        //the expression so the sub-expression a*b is performed using integers that is why byte b=50; b=b*2; will give an error (but not b=50*2)
        //as b is converted into integer to multiply it by 2 which cannot be stores in a byte datatype
        byte yo=50;
        //yo=yo*2;
        System.out.println(yo);

        //Java type promotion
        System.out.println(3*4.56);

        int number='a';
        System.out.println(number);   //will print the ascii value of a (automatic type-conversion)

        //Java follows unicode principles
        System.out.println("नमस्ते");


    }
}
