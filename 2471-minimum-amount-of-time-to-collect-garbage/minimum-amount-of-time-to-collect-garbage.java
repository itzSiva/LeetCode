class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len=0,m_ind=-1,g_ind=-1,p_ind=-1;
        int j=0;
        for(String s:garbage){
                len=len+s.length();
                if(s.contains("M")){
                m_ind=j;
                }
                if(s.contains("G")){
                g_ind=j;
                }
               if(s.contains("P")){
                p_ind=j;
                }  
            j++;
        }
        
        int sum=0;
        for(int i=0;i<m_ind;i++){
            sum+=travel[i];
        }
         for(int i=0;i<p_ind;i++){
             sum+=travel[i];
        }
         for(int i=0;i<g_ind;i++){
             sum+=travel[i];
        }

      sum+=len;
    return sum;
    }
}