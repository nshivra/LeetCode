public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null) return 0;
        else if(nums.length == 1){
            if(nums[0] == target || nums[0] > target) return 0;
            else return 1;
        }
        int low = 0;
        int high = nums.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] >target && mid == 0) return 0;
            else if(nums[mid] <target && mid == nums.length-1) return nums.length;
            else if(nums[mid] >target && nums[mid-1] < target) return mid;
            else if(nums[mid] <target && nums[mid+1] > target) return mid+1;
            else if(nums[mid] >target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
