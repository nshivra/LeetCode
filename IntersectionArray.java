public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> h1 = new HashMap<Integer,Boolean>();
        for(int i=0;i<nums1.length;i++){
            h1.put(nums1[i],true);
        }
        
        HashMap<Integer,Boolean> h2 = new HashMap<Integer,Boolean>();
        for(int i=0;i<nums2.length;i++){
           
            if(h1.containsKey(nums2[i])){
                h2.put(nums2[i],true);
            }
        }
        
        int[] result = new int[h2.size()];
        int count = 0;
        for(Integer i: h2.keySet()){
            result[count] = i;
            count++;
        }
        
        return result;
    }
}
