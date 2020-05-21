class Solution {
    public boolean checkInclusion(String s1, String s2) {
         char a[]=s1.toCharArray();
          Arrays.sort(a);
        s1=String.valueOf(a);
         for(int i=0;i<s2.length()-s1.length()+1;i++)
         {
             String t=s2.substring(i,i+s1.length());
             char t1[]=t.toCharArray();
             Arrays.sort(t1);
             t=String.valueOf(t1);
             if(t.equals(s1))
                  return true;
         }
        return false;
    }
}
