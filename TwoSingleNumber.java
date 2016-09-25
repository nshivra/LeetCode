public class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] result = {-1,-1};
        int count = 0;
        for(int i=0;i<nums.length-1;){
            if(nums[i] == nums[i+1]){
                i = i+2;
            }
            else{
                result[count] = nums[i];
                count++;
                i = i+1;   
            }
        }
        
        if(count < 2){
            result[count] = nums[nums.length-1];
        }
        
        return result;
    }
}
