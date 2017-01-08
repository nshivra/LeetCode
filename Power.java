public class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        else if(x == 1) return 1;
        else if(x == Double.MAX_VALUE) return Double.MAX_VALUE;
        
        if(n == 0) return 1;
        else if(n == 1) return x;
        else if(n == -1) return (1/x);
        else if(n>0)
        {
                return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        }
        else
        {
                return (n%2 == 0) ? myPow(x*x, n/2) : (1/x)*myPow(x*x, n/2);
        }
    }
}
