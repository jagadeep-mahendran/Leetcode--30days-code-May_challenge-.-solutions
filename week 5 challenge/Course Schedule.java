class Solution {
    List<Integer> li[];
    boolean visited[];
    boolean marked[];
    public boolean canFinish(int n, int[][] pre) {
        li=new ArrayList[n];
        
        for(int i=0;i<n;i++)
              li[i]=new ArrayList<>();
        visited=new boolean[n];
        marked=new boolean[n];
        for(int i=0;i<pre.length;i++)
             li[pre[i][0]].add(pre[i][1]);
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                if(iscyclic(i))
                     return false;
            }
        }
        return true;
    }
    public boolean iscyclic(int i)
    {
        visited[i]=true;
         for(int j=0;j<li[i].size();j++)
         {
             if(!visited[li[i].get(j)])
             {
                 if(iscyclic(li[i].get(j)))
                        return true;
             }
             else if(!marked[li[i].get(j)])
                  return true;
         }
        marked[i]=true;
        return false;
        
    }
}
