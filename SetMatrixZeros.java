public class Solution {
    public void setZeroes(int[][] matrix) {
        StringBuilder rows = new StringBuilder();
        StringBuilder cols = new StringBuilder();
        
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(matrix[i][j] == 0){
                    rows.append(i+"~");
                    cols.append(j+"~");
                }
            }
        }
        
        if(!"".equals(rows.toString())){
            String[] rowArr = rows.toString().split("~");
            
            for(String s:rowArr){
                int r = Integer.parseInt(s);
                for(int i=0;i<col;i++){
                    matrix[r][i] = 0;
                }
            }
        }

        if(!"".equals(cols.toString())){
            String[] colArr = cols.toString().split("~");
            
            for(String s:colArr){
                int c = Integer.parseInt(s);
                for(int i=0;i<row;i++){
                    matrix[i][c] = 0;
                }
            }
        }
    }
}
