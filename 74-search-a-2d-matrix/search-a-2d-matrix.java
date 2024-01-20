class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // for(int i=0;i<n;i++){
        //     for(int j=0; j<m;j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        //  return false;   


        // Using Binary Serach

        int left=0;
        int right = m*n-1;
        
        while(left <= right){
            int mid = left+(right-left)/2;
            int mid_val = matrix[mid/n][mid%n];
           
            if(mid_val == target){
                return true;
            }
            else if(mid_val < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
         
        }
            return false;  
    }
}