class Solution {
    public int countSquares(int[][] matrix) {
         /* int n=arr.length;
         int m=arr[0].length;
         int dp[][]=new int[n][m];
        int res=0;
          for(int i=0;i<m;i++){
                dp[0][i]=arr[0][i];
          res+=dp[0][i];
           }
        for(int i=0;i<n;i++){
                dp[i][0]=arr[i][0];
            res+=dp[i][0];
        }
           
         for(int i=1;i<n;i++)
         {
             for(int j=1;j<m;j++)
             {
                 if(arr[i][j]==1)
                 {
                     dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                 }
                 else
                      dp[i][j]=0;
                 res+=dp[i][j];
             }
               
         }
        return res-1;*/
         int total = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0)
                    continue;
                if(i == 0 || j == 0){
                    total += matrix[i][j];
                    continue;
                }
                int min = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                matrix[i][j] += min;
                total += matrix[i][j];
            }
        }
        return total;
    }
}
