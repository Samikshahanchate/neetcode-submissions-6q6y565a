class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       

        int m= matrix.length, n = matrix[0].length ;
        int l=0, r= m*n -1;

        while(l <= r){

            int mid = l+(r-l) /2;
            int rows =  mid / n , cols = mid % n;

            if(target == matrix[rows][cols])
                return true;
            
            else if(target > matrix[rows][cols]){

               l= mid+1;
            }

            else{
                
                r = mid - 1;
            }

        }   
        
        return false;
    }
    
}
