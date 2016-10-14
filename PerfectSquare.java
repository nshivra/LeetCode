public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int left = 0;
        int right = num;
        while(left<=right){
            int mid = left+(right-left)/2;
            int t = mid*mid;
            if(t == num && num%mid == 0)
            {
                return true;
            }
            else if(mid == 0 || mid<num/mid)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return false;
    }
}
