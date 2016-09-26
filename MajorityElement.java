public class Solution {
    public int majorityElement(int[] nums) {
        int[] b = {nums[0],1};
        for(int i=1;i<nums.length;i++){
            if(nums[i] == b[0]){
                b[1] = b[1] + 1;
            }
            else{
                if(b[1] > 1){
                    b[1] = b[1] - 1;
                }
                else{
                    b[0] = nums[i];
                    b[1] = 1;
                }
            }
        }
        
        return b[0];
        
    }
}
