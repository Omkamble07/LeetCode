class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int len = 0;
       
        while(r<s.length()){
            char curr = s.charAt(r);
            if(!set.contains(curr)){
                set.add(curr);
                len = Math.max(len,r-l+1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return len;
        
    }
}