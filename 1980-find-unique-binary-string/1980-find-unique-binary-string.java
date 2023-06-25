class Solution {
    public static int n;
    public static void helper(int ind,HashSet<String>hs,ArrayList<String>ds,StringBuilder sb){
        if(ind==n){
            if(!hs.contains(sb.toString())) ds.add(sb.toString());
            return;
        }
        if(ds.size()>0) return;
        for(int i=ind;i<n;i++){
            //either flip the character at that index 
            sb.setCharAt(i,sb.charAt(i)=='0'?'1':'0');
            helper(i+1,hs,ds,sb);
            sb.setCharAt(i,sb.charAt(i)=='0'?'1':'0');
            //or skip the character at that index
            helper(i+1,hs,ds,sb);
        }
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String>hs=new HashSet<>();
        ArrayList<String>ds=new ArrayList<>();
        n=nums[0].length();
        for(String str:nums)    hs.add(str);
        for(String str:nums)
            helper(0,hs,ds,new StringBuilder(str));
        return ds.get(0);
    }
}