public class NumArray {
    int[] numsCp;
    public NumArray(int[] nums) {
        numsCp = new int[nums.length];
        if(nums.length>0)
        {
            numsCp[0] = nums[0];
            for(int i=1;i<nums.length;i++)
            {
                numsCp[i] = nums[i]+numsCp[i-1];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0)
        {
            return numsCp[j];
        }
        else
        {
            return numsCp[j] - numsCp[i-1];
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
