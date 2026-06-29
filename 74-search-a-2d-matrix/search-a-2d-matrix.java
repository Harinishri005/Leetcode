class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int left=0,right=r*c-1;
        while(left<=right){
            int mid=(left+right)/2;
            int row=mid/c;
            int col=mid%c;
            if(matrix[row][col]==target) return true;
            else if(target>matrix[row][col])left=mid+1;
            else right=mid-1;  
        }
        return false;
    }
}