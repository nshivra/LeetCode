public class Solution {
    
    public int helper(int[] a,int target,int low,int high)
    {
        System.out.println(low + " " + high);
        if(low<high-1)
        {
            int mid = low+(high-low)/2;
            if(a[mid] == target) return mid;
            else if(a[low] < a[mid])
            {
                if(target<a[mid] && target>=a[low])
                {
                    return helper(a,target,low,mid-1); 
                }
                else
                {
                    return helper(a,target,mid+1,high);
                }
            }
            else if(a[high] > a[mid])
            {
                if(target>a[mid] && target<=a[high])
                {
                    return helper(a,target,mid+1,high); 
                }
                else
                {
                    return helper(a,target,low,mid-1);
                }
            }
        }
        else if(low+1 >= high)
        {    
            if(a[low] == target) return low;
            else if(a[high] == target) return high;
            else return -1;
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1)
        {
            if(nums[0] == target) return 0;
            else return -1;
        }
        if(nums.length == 2)
        {
            if(nums[0] == target) return 0;
            else if(nums[1] == target) return 1;
            else return -1;
        }
        return helper(nums,target,0,nums.length-1);
    }
}
