class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        int res=0;
        int f=0;
        
        for(int i=0;i<n-1;i=i+2)
        {
            if(a[i]!=a[i+1])
            {
                res=a[i];
                f=1;
                break;
            }
        }
        if(f==0)
             return a[n-1];
        return  res;
    }
}
