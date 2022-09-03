public class lc_binarySearch {
    public static void main(String args[]) {
        System.out.println(search(5));
    }
    static int search( int target ){
        int nums[] = {2,5};
        int j = nums.length - 1 ;
        int i = 0;

        for( i = 0 ; i<= j ; i++) {
            int mid = (i + j)/2;
            if(nums[mid] == target) {

                return mid;
            }
            if(target > nums[mid]) {
                i = mid +1;
            }
            else if(target < nums[mid]){
                j = mid -1;
            }
            else{
                return -1;
            }
        }return 1;

    }

}
