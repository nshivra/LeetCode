public class Solution {
    
    public List<List<Integer>> permuteAll(int[] nums,int k, List<List<Integer>> l) {
        if(k == nums.length){
            List<Integer> a = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                a.add(nums[i]);
            }
            l.add(a);
            return l;
        }
        else{
            for(int i=k;i<nums.length;i++){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                
                l = permuteAll(nums,k+1,l);
                
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
        }
        return l;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        return permuteAll(nums,0,l);
         
    }
}
