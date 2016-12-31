public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int length = 0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i-2] == nums[i-1] && nums[i-1] == nums[i])
            {
                nums[i-2] = Integer.MAX_VALUE;
                length++;
            }
        }
        Arrays.sort(nums);
        return nums.length - length;
    }
}
