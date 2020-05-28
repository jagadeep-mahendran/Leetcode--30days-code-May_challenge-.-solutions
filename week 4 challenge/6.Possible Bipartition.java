class Solution {
    public boolean possibleBipartition(int n, int[][] dis) {
          List<Integer> li[]=new ArrayList[n];
       for(int i=0;i<n;i++)
       {
           li[i]=new ArrayList<>();
       }
            for(int i=0;i<dis.length;i++)
            {
              int x=dis[i][0];
                int y=dis[i][1];
                li[x-1].add(y-1);
                li[y-1].add(x-1);
            }
         int col[]=new int[n];
        for(int i=0;i<n;i++)
        {   
            if(col[i]!=0)
                 continue;
             col[i]=1;
              Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(!q.isEmpty())
            {
                int indx=q.remove();
                 for(int j=0;j<li[indx].size();j++)
                 {  // System.out.println("rdf");
                     if(col[indx]==col[li[indx].get(j)])
                         return false;
                     if(col[li[indx].get(j)]==0)
                     {                     
                       col[li[indx].get(j)]=-col[indx];
                       q.add(li[indx].get(j));
                     }
                 }
            }
             
        }
        return true;
    }
}
