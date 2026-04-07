class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(grid,i,j);
                }
            }
        }
        return count;
    }
    public void helper(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1' ){
            return;
        }
        grid[i][j]='0';
        helper(grid,i-1,j);
        helper(grid,i+1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
    }
}