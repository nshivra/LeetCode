public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int incl = nums[0];
        int excl = 0;
        for(int i=1;i<nums.length;i++)
        {
            int temp = Math.max(excl,incl);
            incl = nums[i] + excl;
            excl = temp;
        }
        
        return Math.max(excl,incl);
    }
}
