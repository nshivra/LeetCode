public class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }
        
        if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return Math.min(nums[0],nums[1]);
        else
        {
            int start = 0;
            int end = nums.length-1;
            while(start<=end)
            {
                if(start == end) return nums[start];
                else if(start == end-1) return Math.min(nums[start],nums[end]);
                int mid = start + (end-start)/2;
                
                if(mid>0 && mid<nums.length-1 && nums[mid-1]>nums[mid] && nums[mid]<nums[mid+1])
                {
                    return nums[mid];
                }
                else if(nums[mid]<nums[end])
                {
                    end = mid-1;
                }
                else if(nums[mid]>nums[end])
                {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
