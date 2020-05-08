class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
             if(!mp.containsKey(nums[i]))
                   mp.put(nums[i],0);
             mp.put(nums[i],mp.get(nums[i])+1);
         }
           int max=0,res=0;
             for(Map.Entry i:mp.entrySet())
             {
                 if(max<(int)i.getValue())
                 {
                     max=(int)i.getValue();
                     res=(int)i.getKey();
                 }
             }
        return res;
    }
}
