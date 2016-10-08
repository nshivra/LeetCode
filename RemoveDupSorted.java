public class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Boolean> h = new LinkedHashMap<Integer,Boolean>();
        for(int i = 0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],true);
            }
        }
        int count = 0;
        for(Integer i:h.keySet()){
            nums[count] = i;
            count++;
        }
        return count;
    }
}
