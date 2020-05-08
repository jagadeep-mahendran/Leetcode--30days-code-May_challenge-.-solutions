class Solution {
    public int numJewelsInStones(String J, String s) {
         int n=s.length();
        int ct=0;
        for(int i=0;i<J.length();i++)
        {
            char t=J.charAt(i);
            for(int j=0;j<n;j++)
            {
                if(t==s.charAt(j))
                      ct++;
            }
        }
        return ct;
        
    }
}
