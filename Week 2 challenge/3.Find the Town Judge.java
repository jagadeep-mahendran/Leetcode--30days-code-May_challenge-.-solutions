class Solution {
    public int findJudge(int n, int[][] tr) {
         HashSet<Integer> hs=new HashSet<>();
           int tn=tr.length;
           
         if(tn==0)    // edge case;
              return 1;
              
         for(int i=0;i<tn;i++)
         {
             hs.add(tr[i][0]);
         }
        int ct=0;
         for(int i=0;i<tn;i++)
         {
             if(!hs.contains(tr[i][1]))
             {     ct=0;
                 for(int j=0;j<tn;j++)
                 {
                     if(tr[j][1]==tr[i][1])
                          ct++;
                 }
                 if(ct==n-1)
                 {
                     return tr[i][1];
                      // break;
                 }
             }
         }
        return -1;
    }
}
