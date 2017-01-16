public class NumArray {
    int[] numsTemp;
    public NumArray(int[] nums) {
        if(nums == null || nums.length == 0){
            numsTemp = new int[0];
        }
        else
        {
            numsTemp = new int[nums.length];
            numsTemp[0] = nums[0];
            for(int i=1;i<numsTemp.length;i++)
            {
                numsTemp[i] = nums[i] + numsTemp[i-1];
            }
        }
    }

    void update(int i, int val) {
        if(i == 0){
            val = val - numsTemp[i];
        }
        else
        {
            val = val - numsTemp[i] + numsTemp[i-1];
        }
        for(int j=i;j<numsTemp.length;j++)
        {
            numsTemp[j] +=val;
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0) return numsTemp[j];
        else
        {
            return numsTemp[j] - numsTemp[i-1];
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
