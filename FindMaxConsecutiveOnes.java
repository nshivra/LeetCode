public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsOnes = 0;
        int numOnes = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1) numOnes++;
            else
            {
                maxConsOnes = Math.max(maxConsOnes,numOnes);
                numOnes = 0;
            }
        }
        maxConsOnes = Math.max(maxConsOnes,numOnes);
        return maxConsOnes;
    }
}
