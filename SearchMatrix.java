public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int count = r-1;
        for(int i=0;i<r-1;i++){
            if(target == matrix[i][0] ||  target == matrix[i+1][0]) return true;
            else if(target > matrix[i][0] && target < matrix[i+1][0]){
                count = i;
                break;
            }
        }
        int result = Arrays.binarySearch(matrix[count],target);
        if(result < 0) return false;
        else return true;
    }
}
