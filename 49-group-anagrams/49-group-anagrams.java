class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> ans = new ArrayList<>();
    
    int n = strs.length;
    
    HashMap<String,ArrayList<Integer>> map = new HashMap<>();
    
    for(int i=0;i<n;i++)
    {
        String s = strs[i];
        char[] c = s.toCharArray();            
        Arrays.sort(c);
        
        if(map.containsKey(String.valueOf(c)))
        {
            map.get(String.valueOf(c)).add(i);
        }
        else{
            ArrayList<Integer> l = new ArrayList<>();
            l.add(i);
            map.put(String.valueOf(c),l);
        }            
    }
    
    for(Map.Entry<String,ArrayList<Integer>> e:map.entrySet())
    {
        List<String> l = new ArrayList<>();
        ArrayList<Integer> a = e.getValue();
        for(Integer i:a)
        {
            l.add(strs[i]);
        }
        ans.add(l);
    }
    
    return ans;
        
    }
}