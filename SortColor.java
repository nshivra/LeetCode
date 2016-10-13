public class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        
        int count = 0;
        for(int i=0;i<count0;i++){
            nums[count] = 0;
            count++;
        }
        for(int i=0;i<count1;i++){
            nums[count] = 1;
            count++;
        }
        for(int i=0;i<count2;i++){
            nums[count] = 2;
            count++;
        }
        
    }
}
