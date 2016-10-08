public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(h.containsKey(nums[i]) && (i-h.get(nums[i]))<=k) return true;
            h.put(nums[i],i);
        }
        return false;
    }
}
