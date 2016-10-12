public class Solution {
    public int countPrimes(int n) {
        
        if(n <= 1) return 0;
        
        boolean[] b = new boolean[n];
        for(int i=0;i<n;i++) b[i] = true;
        b[0] = b[1] = false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(b[i]){
                int j = i;
                while(j<n){
                    b[j] = false;
                    j = j + i;
                }
                b[i] = true;
            }
        }
        
        
        int count = 0;
        for(int i=0;i<n;i++){
            if(b[i]) count++;
        }
        
        return count;
    }
}
