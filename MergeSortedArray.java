public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(m == 0){
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }
        for(int i=m-1;i>=0;i--){
            nums1[i+n] = nums1[i];
        }
        
        int a = n;
        int b = 0;
        int c = 0;
        
        while(a<m+n && b<n){
            if(nums1[a] <= nums2[b]){
                nums1[c] = nums1[a];
                a++;
                c++;
            }
            else{
                nums1[c] = nums2[b];
                b++;
                c++;
            }
        }
        
        while(a<m+n){
            nums1[c] = nums1[a];
            a++;
            c++;
        }
        
        while(b<n){
            nums1[c] = nums2[b];
            b++;
            c++;
        }
        
    }
}
