import java.util.*;
public class lc_66_plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nayaArr;
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                break;
            }
            else {
                arr[i] = 0;
                nayaArr = new int[n+1];
                nayaArr[i]= 0;
                nayaArr[0] = 1;
                if(i == 0)
                System.out.println(Arrays.toString(nayaArr));
            }
        }
    }
}
