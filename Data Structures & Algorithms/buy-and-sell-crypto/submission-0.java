class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        
        //second -first and then maximize this 
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int currSub=prices[j]-prices[i];
                profit=Math.max(currSub,profit);
            }
        }

        return profit;

        
    }
}
