public class NumMatrix {
    int[][] matrixCp;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = 0;
        if(row>0) col = matrix[0].length;
        if(!(row==0 && col == 0))
        {
            matrixCp = new int[row][col];
            for(int i=0;i<matrix.length;i++)
            {
                matrixCp[i][0] = matrix[i][0];
            }
            for(int i=0;i<row;i++)
            {
                for(int j=1;j<col;j++)
                {
                    matrixCp[i][j] = matrix[i][j] + matrixCp[i][j-1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i=row1;i<=row2;i++)
        {
            if(col1 == 0)
            {
                sum = sum + matrixCp[i][col2];
            }
            else
            {
                sum = sum + matrixCp[i][col2] - matrixCp[i][col1-1];
            }
        }
        
        return sum;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
