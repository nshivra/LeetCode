public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            while(i+1!=nums.length && nums[i+1] == nums[i] + 1){
                i++;
            }
            if(nums[i] == start){
                result.add(String.valueOf(start));
            }
            else{
                result.add(start+"->"+nums[i]);
            }
        }
        return result;
    }
}
