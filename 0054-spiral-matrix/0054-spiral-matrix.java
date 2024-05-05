class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;
        int flag=0;
        List<Integer> val = new ArrayList<>();
        while(sc<=ec && sr<=er){
            if(flag==0){
                for(int i=sc;i<=ec;i++){
                    val.add(matrix[sr][i]);
                }
                ++sr;
                flag++;
            }
            else if(flag==1){
                for(int i=sr;i<=er;i++){
                    val.add(matrix[i][ec]);
                }
                --ec;
                flag++;
            }
            else if(flag==2){
                for(int i=ec;i>=sc;i--){
                    val.add(matrix[er][i]);
                }
                --er;
                flag++;
            }
            else if(flag==3){
                for(int i=er;i>=sr;i--){
                    val.add(matrix[i][sc]);
                }
               ++sc ;
                flag=0;
            }
            
        }
        return val;

    }
}