class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int idx=board[i][j]-'1';
                    int boxidx=(i/3)*3+(j/3);
                    if(row[i][idx]|| col[idx][j] || box[boxidx][idx]){
                        return false;
                    }
                    row[i][idx]=true;
                    col[idx][j]=true;
                    box[boxidx][idx]=true;
                }
            }
        }
        return true; 
    }
}