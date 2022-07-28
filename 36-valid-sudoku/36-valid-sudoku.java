class Solution {
    public boolean isValid(char[][] board,int i,int j){
        char temp=board[i][j];
        for(int k=0;k<9;k++){
            if(board[i][k]!='.'&& k!=j && temp==board[i][k])
                    return false;
             if(board[k][j]!='.' && k!=i && temp==board[k][j])
                  return false;
             
             int r=3*(i/3)+k/3;
             int v=3*(j/3)+k%3;
             if(i!=r && j!=v){
             if(temp==board[r][v])
                return false;
             }
            }
        
        return true;
        
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.')
                {
                    if(!isValid(board,i,j))
                        return false;
                }
                    
            }
        }
            return true;
        }
    
}