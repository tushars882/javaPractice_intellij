import java.util.*;
public class UsingReturn {

    public static int returnVal(){
        int val=10;

        return returnVal();
    }

    public static int removeDuplicates(int[] nums) {
        //     int count =0;
        //     int k=0;
        //     for(int i=0;i<nums.length-1;i++){
        //         if(nums[i]!=nums[i+1]){
        //             count++;
        //             nums[k]=nums[i];
        //             k++;
        //         }
        // }return k+;
        if(nums.length == 1){
            return 0;
        }

        int pointer = 0, count = 0;
        for(int i = 0; i < nums.length-1; i++){
            int temp = nums[i];
            if(nums[i+1] == temp){
                nums[pointer] = temp;
                pointer++;
                while(nums[i+1] == temp){
                    count++;
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String args[])
    {
        removeDuplicates(new int[]{1,1,2});
    }
}






