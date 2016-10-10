public class Solution {
    public boolean isHappy(int n) {
        
        if(n == 0) return false;
        if(n == 1) return true;
        
        HashMap<Integer,Boolean> h = new HashMap<Integer,Boolean>();
    
        while(n>1){
            if(h.containsKey(n)){
                return false;
            }
            else{
                h.put(n,true);
            }
            int sum = 0;
            while(n>=1){
                int a = n%10;
                n = (n - n%10)/10;
                sum = sum + (int)Math.pow(a,2);
            }
            n = sum;
        }
        if(n == 1) return true;
        else return false;
    }
}
