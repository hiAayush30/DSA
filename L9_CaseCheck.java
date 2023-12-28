import java.util.Scanner;
//To check if the input character is uppercase or lowercase
public class L9_CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        System.out.println(ch);
        if (ch>='a' && ch<='z'){      //will compare with ascii value
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
