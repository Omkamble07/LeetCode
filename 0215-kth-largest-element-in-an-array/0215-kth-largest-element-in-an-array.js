/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function(nums, k) {
    const sorted = nums.sort((a, b) => b - a)
    
    for(let i=0; i<nums.length; i++){
        return nums[k-1]
    }
};