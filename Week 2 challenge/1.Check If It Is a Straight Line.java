
class Solution {
    public boolean checkStraightLine(int[][] co) {
           int n=co.length;
        if(n==2)
              return true;
         double m=(double)(co[1][1]-co[0][1])/(double)(co[1][0]-co[0][0]);
        System.out.println(m);
           for(int i=0;i<n-1;i++)
           {    if((co[i+1][0]-co[i][0])==0)
                     return false;
               double m2=(co[i+1][1]-co[i][1])/(co[i+1][0]-co[i][0]);
               System.out.println(m2);
               if(m!=m2)
                    return false;
           }
        return true;
    }
}
