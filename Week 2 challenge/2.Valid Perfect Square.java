class Solution {
    public boolean isPerfectSquare(int num) {
        Scanner sc=new Scanner(System.in);
        int n=num;
        double x=Math.sqrt(n);
        int y=(int)Math.sqrt(n);
         if(x==y)
              return true;
        else
             return false;
    }
}
