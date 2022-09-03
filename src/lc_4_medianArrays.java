import java.util.Arrays;

public class lc_4_medianArrays {

    static double median() {
        int[]a = {1,2};
        int[] b = {3,4};
        int l1 = a.length;
        int l2 = b.length;
        int[] temp = new int[ l1 + l2];
        double doub=0;

        for(int i = 0 ; i < l1 ; i++ ) {
            temp[i] = a[i];
        }
        for(int j = 0 ; j < l2 ; j++) {
            temp[l1 + j] = b[j];
        }
        Arrays.sort(temp);
        int l3 = temp.length;
        int mid = (l3/2);
        if(l3 % 2 != 0) {
            double d = temp[(int) (l3/2.0000f)];
            return d;
        }
        else{
            float dub = temp[mid];
            float x2 = temp[mid-1];
            return ((double) (dub+x2)/2);
        }



    }

    public static void main(String[] args) {
//        int[] t = median(new int[]{8,1,2} , new int[]{77,21,33,2});
        System.out.println(median());

        }
    }

