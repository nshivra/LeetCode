public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int result = 10;
        while(n>1){
            int j = 9;
            int i = 1;
            int count = 9;
            while(i<n && j > 0){
                count = count * j;
                j--;
                i++;
            }
            result = result + count;
            n--;
        }
        return result;
    }
}
