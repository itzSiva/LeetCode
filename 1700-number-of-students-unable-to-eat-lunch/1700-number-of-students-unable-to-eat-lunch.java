class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int n=students.length;
        for(int i=0,j=n-1 ;i<n;i++,j--){
            q.add(students[i]);
            st.push(sandwiches[j]);
        }
        int k=0;
        while(k<=n && !st.isEmpty() && !q.isEmpty()){
            if(st.peek()==q.peek()){
                st.pop();
                q.remove();
                k=0;
            }
            else{
                q.add(q.remove());
                k++;
            }
        }
        return st.size();
    }
}