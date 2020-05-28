class Solution {
    public int findMaxLength(int[] a) {
        int n=a.length;
          Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0,max=0;
          for(int i=0;i<n;i++)
          {
              if(a[i]==0)
                    sum+=-1;
              else
                   sum+=1;
              if(mp.containsKey(sum))
                   max=Math.max(max,i-mp.get(sum));
              else
                   mp.put(sum,i);
          }
        return max;
    //here we go for n^2 complexity .. Not Accepted Time exists error
      /*  int len=0,max=0,c1=0,c0=1;
        for(int i=0;i<n;i++)
        {
            len=0;
            c0=0;
            c1=0;
            for(int j=i;j<n;j++)
            {
                 len++;
                if(a[j]==1)
                     c1++;
                if(a[j]==0)
                      c0++;
                 if(c1==c0)
                 {
                     if(max<len)
                          max=len;
                 }
            }
        }
        return max;*/
    }
}
