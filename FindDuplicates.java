public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])-1] <0) l.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1] = -1*Math.abs(nums[Math.abs(nums[i])-1]);
        }
        return l;
    }
}
