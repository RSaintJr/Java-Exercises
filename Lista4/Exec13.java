import java.util.Arrays;

public class Exec13 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {11,12,13,14,15,16,17,18,19,20};
        int n1 = num.length;
        int n2 = num2.length;
        int[] num3 = new int[n1 + n2];

        System.arraycopy(num,0,num3,0,n1);
        System.arraycopy(num2,0,num3,n1,n2);

        System.out.println(Arrays.toString(num3));
    }
}