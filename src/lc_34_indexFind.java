import java.util.*;
public class lc_34_indexFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int target=sc.nextInt();
        int[] ar=new int[n];
        int count=0;
        for(int i=0 ;  i<n ; i++){
            ar[i]=sc.nextInt();
        }
        int i=0;
        int j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(ar[mid] == target){
                System.out.println(ar[mid]);
            }
            if(target < ar[mid]){
                j=mid-1;
            }
        }



    }
}
