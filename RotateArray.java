public class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        int n = nums.length;
        if(k>n){
            k = n - 1 - k%n;
        }
        else{
            k = n - 1 - k;
        }
        int i=0;
        int j = k;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        i = k+1;
        j = n-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        i = 0;
        j = n-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
}
