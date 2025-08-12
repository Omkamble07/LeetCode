class Solution {
    public void moveZeroes(int[] nums) {
        int newIndex = 0 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[newIndex] = nums[i];
                newIndex++ ;
            }
        }
        while(newIndex < nums.length){
            nums[newIndex] = 0;
            newIndex++ ;
        }
    }
}