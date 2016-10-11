public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<=nums.length-1;i++){
            sum = sum + nums[i];
        }
        
        return actual - sum;
    }
}
