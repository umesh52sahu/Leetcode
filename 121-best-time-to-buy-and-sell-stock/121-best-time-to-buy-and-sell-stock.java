class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int sell= prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<sell){
                sell=prices[i];
            }
            if(prices[i]-sell> mp){
                mp=prices[i]-sell;
            }
            
        }
        return mp;
    }
}