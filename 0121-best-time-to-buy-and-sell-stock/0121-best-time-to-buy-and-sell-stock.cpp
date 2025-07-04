class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxP = 0, buyStock = prices[0];

        for(int i=1; i<prices.size(); i++){
            if(prices[i] > buyStock){
                maxP = max(maxP , prices[i]-buyStock);
            }
            buyStock = min(prices[i],buyStock);
        }
        return maxP;
    }
};