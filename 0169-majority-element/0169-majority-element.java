class Solution {
    public int majorityElement(int[] nums) {
        int majEle = 0 ;
        int freq = 0 ;

        for(int num : nums){
            if(freq == 0){
                majEle = num;
            }

            if(num == majEle){
                freq ++;
            }else{
                freq --;
            }
        }
        return majEle;
    }
}