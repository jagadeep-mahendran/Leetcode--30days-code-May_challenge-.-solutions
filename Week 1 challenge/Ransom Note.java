class Solution {
    public boolean canConstruct(String r, String m) {
          char a[]=m.toCharArray();
        int f=0;
        for(int i=0;i<r.length();i++)
        {   f=0;
            for(int j=0;j<a.length;j++)
            {
                if(r.charAt(i)==a[j]){
                      a[j]='*';
                       f=1;
                    break;
                }
            }
            if(f==0)
                  return false;
        }
        return true;
    }
    
}
