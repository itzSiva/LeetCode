class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int M=0,mind=0,G=0,gind=-1,P=-1,pind=-1;
        int j=0;
        for(String s:garbage){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='M'){
                M++;
                mind=j;
                }
                else if(s.charAt(i)=='G'){
                G++;
                gind=j;
                }
                else if(s.charAt(i)=='P'){
                P++;
                pind=j;
                }  
            }
            j++;
           
        }
        System.out.println(P);
        int sum=0;
        for(int i=0;i<mind;i++){
            sum+=travel[i];
        }
         for(int i=0;i<pind;i++){
             sum+=travel[i];
        }
         for(int i=0;i<gind;i++){
             sum+=travel[i];
        }

            sum+=M+P+G;
        return sum+1;
    }
}