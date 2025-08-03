class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet set = new HashSet<>();
        int n = grid.length;
        int a = 0; // repeated
        int b = 0; // missing

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        for(int num=1; num<=n*n; num++){
            if(!set.contains(num)){
                b = num;
            }
        }
        return new int[] {a,b};
    }
}