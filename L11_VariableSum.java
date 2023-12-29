public class L11_VariableSum {
    static int sum(int ...yo){
        int sum=0;
        int i=0;
        while (i<yo.length){
            sum=sum+yo[i];
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,4,5));
    }
}
