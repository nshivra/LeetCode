public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int max_so_far= 0;
        int min_ele = prices[0];
        for(int i=0;i<prices.length;i++){
            if(min_ele > prices[i]){
                min_ele = prices[i];
            }
            
            if(prices[i] - min_ele > max_so_far){
                max_so_far = prices[i] - min_ele;
            }
        }
        
        return max_so_far;
    }
}
