public class Solution {
    public int arrangeCoins(int n) {
        int count = 1;
        int totalFullStairs = 0;
        while(n>=count)
        {
            n = n - count;
            count++;
            totalFullStairs++;
        }
        return totalFullStairs;
    }
}
