class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char [][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(find(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean find(char [][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for (int i=sr; i<sr+ 3;i++) {
            for (int j=sc; j<sc+3;j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}