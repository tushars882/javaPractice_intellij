import java.lang.Math;
public class lc326_3power {
    static boolean isPowerOfThree(int n) {
        double d = Math.round(Math.log(n)/Math.log(3));
        if(n == 0){
            return false;
        }
        if(Math.pow(3,d) == n ){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(243));
    }
}
