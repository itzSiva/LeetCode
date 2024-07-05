class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int hash[]=new int[m];
        Arrays.fill(hash,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>hash[j])
                 hash[j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1)
                 matrix[i][j]=hash[j];
            }
        }
        return matrix;
    }
}