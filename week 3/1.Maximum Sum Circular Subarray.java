class Solution {
public static int maxSubarraySumCircular(int[] A) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    int sum1 = 0, sum2 = 0, total = 0;
    for(int x : A) {
        if(sum1<0){
            sum1 = 0;
        }
        sum1 += x;
        max = Math.max(max, sum1);
        if(sum2>0){
            sum2 = 0;
        }
        sum2 += x;
        min = Math.min(min, sum2);
        total += x;
    }
    return max > 0 ? Math.max(max, total - min) : max;
  }
}
