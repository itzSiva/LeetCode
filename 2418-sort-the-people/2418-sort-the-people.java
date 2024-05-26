class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(h[i]<h[j]){
                   // int tem=h[i];
                   // h[i]=h[j];
                    //h[j]=tem;
                     String temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        return n;
    }
}