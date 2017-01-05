public class Solution {
    public int minMoves2(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) return 0;
        else if(nums.length == 2) return Math.abs(nums[0]-nums[1]);
        
        Arrays.sort(nums);
        int mid = 0;
        int count = 0;
        if(nums.length%2 == 1)
        {
            mid = nums[nums.length/2];
            for(int i=0;i<nums.length;i++)
            {
                if(i!=nums.length/2)
                {
                    count+= Math.abs(nums[i]-mid);
                }
            }
        }
        else
        {
            int count1 = 0;
            int count2 = 0;
            int mid1 = nums[(nums.length-1)/2];
            int mid2 = nums[(nums.length)/2];
            for(int i=0;i<nums.length;i++)
            {
                if(i!=(nums.length-1)/2)
                {
                    count1+= Math.abs(nums[i]-mid1);
                }
                
                if(i!=(nums.length)/2)
                {
                    count2+= Math.abs(nums[i]-mid2);
                }
                count = Math.min(count1,count2);
            }
        }
        return count;
    }
}
