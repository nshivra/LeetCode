public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) return;
        int i=0;
        int j=0;
        while(i<=nums.length-1 && j<=nums.length-1)
        {
            if(nums[i] != 0){
                i++;
            }
            else if(nums[j] == 0){
                j++;
            }
            else if(nums[i] == 0 && nums[j] != 0 && i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else
            {
                int k = i;
                i = j;
                j = k;
            }
        }
    }
}
