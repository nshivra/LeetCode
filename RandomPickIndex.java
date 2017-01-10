public class Solution {

    HashMap<Integer,String> l = new HashMap<Integer,String>();
    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(l.containsKey(nums[i]))
            {
                String s = l.get(nums[i]);
                s = s+"~"+i;
                l.put(nums[i],s);
            }
            else
            {
               String s = ""+i;
               l.put(nums[i],s); 
            }
        }
    }
    
    public int pick(int target) {
        String s = l.get(target);
        if(s == null || s.length() == 0) return -1;
        if(!s.contains("~")) return Integer.parseInt(s);
        String[] c = s.split("~");
        Random rand = new Random();
        int  n = rand.nextInt(c.length);
        return Integer.parseInt(c[n]);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
