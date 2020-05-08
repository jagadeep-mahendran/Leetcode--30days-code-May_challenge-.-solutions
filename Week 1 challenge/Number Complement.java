class Solution {
    public int findComplement(int n) {
          int ct=0;
        int i=0;
        int sum=0;
        while(n>0)
        {
            int d=n%2;
             if(d==0)
              sum=sum+(int)Math.pow(2,i);
            n=n/2;
            i++;
        }
        return sum;
    }
}
