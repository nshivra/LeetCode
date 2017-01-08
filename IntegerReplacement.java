public class Solution {
    public int integerReplacement(int n) {
        if(n==1) return 0;
        else if(n==2) return 1;
        else if(n==3) return 2;
        else if(n == Integer.MAX_VALUE) return 32;
        else if(n%2 == 0) return 1+integerReplacement(n/2);
        else
        {
            return 2+Math.min(integerReplacement((n+1)/2),integerReplacement((n-1)/2));
        }
    }
}
