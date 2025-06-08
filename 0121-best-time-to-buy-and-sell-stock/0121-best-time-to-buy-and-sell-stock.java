class Solution {
    public int maxProfit(int[] prices) {
        
        int min= Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;

        for(int value: prices){
            
            if(value<min){
                min=value;
            }
            profit = value-min;

            if(profit>maxProfit){
                maxProfit=profit;
            }
        }


        return maxProfit;
    }
}
