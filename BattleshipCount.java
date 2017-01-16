public class Solution {
    public int countBattleships(char[][] board) {
        int adjacentX = 0;
        int row = board.length;
        int col = board[0].length;
        int totalX = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j] == 'X')
                {
                    totalX++;
                    if((j<col-1 && board[i][j+1] == 'X') || (i<row-1 && board[i+1][j] == 'X'))
                    {
                        adjacentX++;
                    }
                }
            }
        }
        return totalX - adjacentX;
    }
}
