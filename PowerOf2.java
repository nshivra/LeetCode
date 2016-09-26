public class Solution {
    public boolean isPowerOfTwo(int num) {
        if(num == 0) return false;
        else if(num ==  1) return true;
        else{
            while(num != 1){
                if(num%2 != 0) return false;
                else num = num/2;
            }
        }
        return true;
    }
}
