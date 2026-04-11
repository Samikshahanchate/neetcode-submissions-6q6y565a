class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9 ; i++){

            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> sqr = new HashSet<>();

            for(int j=0; j<9; j++){
                if (board[i][j] != '.' && !row.add(board[i][j])) return false;
                if (board[j][i] != '.' && !col.add(board[j][i])) return false;
                    int k =  (i/3)*3 + (j/3);
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;
                if (board[r][c] != '.' && !sqr.add(board[r][c])) return false;
        
            }
        }
       
     return true;
    }
}


