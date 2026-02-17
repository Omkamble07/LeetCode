/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    const set = new Set(nums)
    let longest = 0

    for(let num of set){
        if(!set.has(num-1)){
            let length = 1
            let curr = num

            while(set.has(curr+1)){
                curr++
                length++
            }
        
            longest = Math.max(longest,length)
        }
        
    }
    return longest

};