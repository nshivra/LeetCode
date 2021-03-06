public class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]!=val){
                i++;
            }
            else if(nums[j]==val){
                j--;
            }
            else
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        int count = 0;
        while(count< nums.length && nums[count]!=val){
            count++;
        }
        
        return count;
        
    }
}
