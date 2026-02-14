/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let set = new Set()
    let left = 0 
    let maxLength = 0

    for(let curr=0; curr<s.length; curr++){

        while(set.has(s[curr])){
            set.delete(s[left])
            left++
        }

        set.add(s[curr])
        maxLength = Math.max(maxLength, (curr+1) -left)
    }
    return maxLength
};