class Solution {
     static Map<String,Integer> mp=new HashMap<>(); 
  
    public String frequencySort(String s) {
         mp.clear();
         
         if(s.equals(""))
              return "";
        
          for(int i=0;i<s.length();i++)
          {       String c=s.substring(i,i+1);
               if(!mp.containsKey(c))
                     mp.put(c,0);
                 mp.put(c,mp.get(c)+1);
          }
         List<Map.Entry<String,Integer>> li=new ArrayList<>(mp.entrySet());
         
       // System.out.println(mp);
     
         String res="";
               Collections.sort(li,new Comparator<Map.Entry<String,Integer>>(){
                  public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
                  {
                       return o2.getValue().compareTo(o1.getValue());
                  }
               });
      //  Map<String, Integer> mp2 = new LinkedHashMap<String, Integer>();  
        for (Map.Entry<String, Integer> i : li)  {
              //mp2.put(i.getKey(), i.getValue());  
              int lp=(int)i.getValue();
            String ad=(String)i.getKey();
             for(int j=0;j<lp;j++)
                  res=res+ad;
        }
           //System.out.println(mp2);
        return res;
    }
}
