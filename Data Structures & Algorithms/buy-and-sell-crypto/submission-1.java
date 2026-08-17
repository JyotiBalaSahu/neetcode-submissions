class Solution {
    public int maxProfit(int[] prices) {
        //optimal approach
        //one pass
        //one counter for min price
        int maxProfit=0;
        int minPrice=prices[0];
        if(prices==null||prices.length<2){
            return 0;
        }

        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                int currentProfit=prices[i]-minPrice;
                maxProfit=Math.max(maxProfit,currentProfit);
            }
        }
        return maxProfit;


    }
}
