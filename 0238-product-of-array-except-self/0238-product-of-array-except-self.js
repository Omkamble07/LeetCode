/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let n = nums.length - 1
    let ans = new Array(n)

    let left = 1
    for(let i=0; i<=n; i++){
        ans[i] = left
        left *= nums[i]
    }

    let right = 1
    for(let i=n; i>=0; i--){
        ans[i] *= right
        right *= nums[i]
    }

    return ans
};