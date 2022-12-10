import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Faisal ={1,4,3,6,8,4};
        for (int i = 0; i<Faisal.length;i++) {
            System.out.println(Faisal[i]);
        }
        System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
        for (int j = 0; j<Faisal.length;j++)
            System.out.println(j);
        int[] z = revArrayh(Faisal);
    }
    public static int[] revArrayh(int[] z){
        System.out.println(Arrays.toString(z));
        return z;
    }
}