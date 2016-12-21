public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y;
        int count = 0;
        while(z>0){
            count = count + z%2;
            z = z/2;
        }
        return count;
    }
}
