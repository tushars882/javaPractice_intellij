//public class lc_80_removeDup2 {
//    static int inp(int[] nums) {
//         int len = nums.length;
//         int temp[] = new int[len];
//         int count = 0 ;
//         int inside = 0;
//         while(count <= 0) {
//             for(int i = 0 ; i < len-1 ; i++) {
//
//                 if(nums [i] == nums[i+1]) {
//                     count++;
//                     if(count <= 2){
//                         inside++;
//                         temp[i] = nums[i];
//                     }
//                 }
//                 else{
//                     temp[i] = nums[i+1];
//                 }
//             }return inside;
//
//         }return 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(inp(new int[]{0,0,1,1,1,1,2,3,3}));
//    }
//}

public class lc_80_removeDup2{
    static int inp(int[] nums){                 //1,1,1,2,2,3
        int i = 2 , j = 2;
        int n = nums.length;
        while( j < n){
            if(nums[j] != nums[i-2] ){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;


    }

    public static void main(String[] args) {
        System.out.println(inp(new int[]{1,1,1,2,2,3}));
    }
}
