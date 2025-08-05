class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int val : nums){
            if(set.contains(val)){
                duplicates.add(val);
            }
            set.add(val);
        }
        return duplicates;
    }
}