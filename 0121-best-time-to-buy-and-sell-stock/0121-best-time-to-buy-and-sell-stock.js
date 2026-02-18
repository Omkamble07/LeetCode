/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0
    let minPrice = Infinity

    for(let currPrice of prices){
        if(currPrice < minPrice){
            minPrice = currPrice
        }else{
            maxProfit = Math.max(maxProfit, currPrice - minPrice)
        }
       
    }
    return maxProfit 
};