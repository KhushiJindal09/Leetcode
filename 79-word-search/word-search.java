class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(helper(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char [][] board,int r,int c,String word,int idx){
        if(idx==word.length()){
            return true;
        }
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(idx)){
            return false;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean found=helper(board,r+1,c,word,idx+1) || helper(board,r-1,c,word,idx+1) || helper(board,r,c+1,word,idx+1) ||helper(board,r,c-1,word,idx+1);
        board[r][c]=temp;
        return found;
    }
}
