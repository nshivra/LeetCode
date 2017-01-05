public class Solution {
    
    public int bSearchStart(int[] nums, int target,int low, int high) {
        if(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] == target)
            {
                if(low == mid) return low;
                else if(nums[mid-1] == nums[mid]) return bSearchStart(nums,target,low,mid-1);
                else return mid;
            }
            else if(nums[mid]>target)
            {
                return bSearchStart(nums,target,low,mid-1);
            }
            else
            {
                return bSearchStart(nums,target,mid+1,high);
            }
        }
        return -1;
    }
    
    public int bSearchEnd(int[] nums, int target,int low, int high) {
        if(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] == target)
            {
                if(high == mid) return mid;
                else if(nums[mid+1] == nums[mid]) return bSearchEnd(nums,target,mid+1,high);
                else return mid;
            }
            else if(nums[mid]>target)
            {
                return bSearchEnd(nums,target,low,mid-1);
            }
            else
            {
                return bSearchEnd(nums,target,mid+1,high);
            }
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        if(nums == null || nums.length == 0)
        {
            a[0] = -1;a[1] = -1;
        }
        else if(nums.length == 1)
        {
            if(nums[0] == target)
            {
                a[0] = 0;a[1] = 0;
            }
            else
            {
                a[0] = -1;a[1] = -1;
            }
        }
        else if(nums.length == 2)
        {
            if(nums[0] == target && nums[1] == target)
            {
                a[0] = 0;a[1] = 1;
            }
            else if(nums[0] == target)
            {
                a[0] = 0;a[1] = 0;
            }
            else if(nums[1] == target)
            {
                a[0] = 1;a[1] = 1;
            }
            else
            {
                a[0] = -1;a[1] = -1;
            }
        }
        else
        {
            a[0] = bSearchStart(nums,target,0,nums.length-1);
            a[1] = bSearchEnd(nums,target,0,nums.length-1);
        }
        return a;
    }
}
