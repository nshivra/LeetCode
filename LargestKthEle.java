public class Solution {
    
    public static void heapify(int[] a,int i, int total)
	{
		int lft = i * 2;
		int rgt = lft + 1;
		int grt = i;

		if (lft <= total && a[lft]>a[grt]) grt = lft;
		if (rgt <= total && a[rgt]>a[grt]) grt = rgt;
		if (grt != i) {
			int temp = a[i];
			a[i] = a[grt];
			a[grt] = temp;
			heapify(a, grt, total);
		}
	}

    public int findKthLargest(int[] nums, int k) {
        int total = nums.length - 1;

		for (int i = total / 2; i >= 0; i--)
			heapify(nums, i, total);

		for (int i = total; i >= nums.length-k; i--) {
			int temp = nums[0];
			nums[0] = nums[i];
			nums[i] = temp;
			total--;
			heapify(nums, 0, total);
		}
		
		return nums[nums.length-k];
    }
}
