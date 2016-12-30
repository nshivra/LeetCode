public class Solution {
    int[] numsTemp;
    int[] numsTemp2;
    public Solution(int[] nums) {
        numsTemp = new int[nums.length];
        numsTemp2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
          numsTemp[i] = nums[i];
          numsTemp2[i] = nums[i];
        } 
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return numsTemp;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        Random random = new Random();
        for(int i=0;i<numsTemp.length;i++)
        {
            int rand = random.nextInt(i + 1);
            if(rand!=i){
                int temp = numsTemp2[i];
                numsTemp2[i] = numsTemp2[rand];
                numsTemp2[rand] = temp;
            }
        }
        return numsTemp2;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
