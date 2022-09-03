import java.lang.*;

public class Lc_202_happyNumber {
    static void number(int n) {
        int last = 0;
        double sum = 0;
        while(true){
            if(n <=9 ){
                System.out.println("false");
                return;
            }
            while( n != 0 ) {

                last = n % 10;
                last = (int) Math.pow(last , 2);
                sum = sum + last;
                n = n / 10;
            }
            n = (int)sum;
            sum = 0;
            if( n ==1) break;

        }
        System.out.println("true");
    }
    public static void main(String args[]) {
        number(1);
    }
}
