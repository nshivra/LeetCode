public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
        for(int i = 0 ;i<nums1.length;i++){
            if(h1.containsKey(nums1[i])){
                int val = h1.get(nums1[i]) + 1;
                h1.put(nums1[i],val);
            }
            else{
                h1.put(nums1[i],1);
            }
        }
        
        int count = 0;
        HashMap<Integer,Integer> h2 = new HashMap<Integer,Integer>();
        for(int i = 0 ;i<nums2.length;i++){
            if(h1.containsKey(nums2[i])){
                if(h2.containsKey(nums2[i])){
                    int val = h2.get(nums2[i]) ;
                    h2.put(nums2[i],val+1);
                    count++;
                }
                else{
                    h2.put(nums2[i],1);
                    count++;
                }
                int val = h1.get(nums2[i]);
                if(val == 1){
                    h1.remove(nums2[i]);
                }
                else{
                    h1.put(nums2[i],val-1);
                } 
            }
        }
        
        int[] result = new int[count];
        int len = 0;
        for(Map.Entry e:h2.entrySet()){
            for(int i=0;i<(int)e.getValue();i++){
                result[len] = (int)e.getKey();  
                len++;
            }
        }
        return result;
    }
}
