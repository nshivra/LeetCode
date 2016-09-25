public class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num+1];
        if(num == 0){
            a[0] = 0;
        }
        else{
            for(int i=1;i<=num;i++){
                if(i%2!=0){
                    a[i] = a[i/2]+1;
                }
                else{
                    a[i] = a[i/2];
                }
            }
        }
        return a;
    }
}
