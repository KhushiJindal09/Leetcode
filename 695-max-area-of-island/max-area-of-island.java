class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        int mcount=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    count=Math.max(count,helper(grid,i,j));
                }
            }
        }
        return count;
    }
    public int helper(int [][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=0;
        int area=1;
        area+=helper(grid,i-1,j);
        area+=helper(grid,i+1,j);
        area+=helper(grid,i,j-1);
        area+=helper(grid,i,j+1);
        return area;
    }
}