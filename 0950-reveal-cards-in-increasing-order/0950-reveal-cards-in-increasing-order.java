class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        int deck1[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
         for(int i=0;i<n;i++){
            q.add(i);
        }
       int ans[]=new int[n];

        for(int i=0;i<n;i++){
           ans[q.peek()]=deck[i];
           q.remove();
           q.add(q.poll());
        }
        
        return ans;
    }
}