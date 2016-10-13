public class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        for(int i=0;i<r;i++){
            for(int j = i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0;i<r;i++){
            int a = 0;
            int b = r-1;
            while(a<b){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++;
                b--;
            }
        }
    }
}
