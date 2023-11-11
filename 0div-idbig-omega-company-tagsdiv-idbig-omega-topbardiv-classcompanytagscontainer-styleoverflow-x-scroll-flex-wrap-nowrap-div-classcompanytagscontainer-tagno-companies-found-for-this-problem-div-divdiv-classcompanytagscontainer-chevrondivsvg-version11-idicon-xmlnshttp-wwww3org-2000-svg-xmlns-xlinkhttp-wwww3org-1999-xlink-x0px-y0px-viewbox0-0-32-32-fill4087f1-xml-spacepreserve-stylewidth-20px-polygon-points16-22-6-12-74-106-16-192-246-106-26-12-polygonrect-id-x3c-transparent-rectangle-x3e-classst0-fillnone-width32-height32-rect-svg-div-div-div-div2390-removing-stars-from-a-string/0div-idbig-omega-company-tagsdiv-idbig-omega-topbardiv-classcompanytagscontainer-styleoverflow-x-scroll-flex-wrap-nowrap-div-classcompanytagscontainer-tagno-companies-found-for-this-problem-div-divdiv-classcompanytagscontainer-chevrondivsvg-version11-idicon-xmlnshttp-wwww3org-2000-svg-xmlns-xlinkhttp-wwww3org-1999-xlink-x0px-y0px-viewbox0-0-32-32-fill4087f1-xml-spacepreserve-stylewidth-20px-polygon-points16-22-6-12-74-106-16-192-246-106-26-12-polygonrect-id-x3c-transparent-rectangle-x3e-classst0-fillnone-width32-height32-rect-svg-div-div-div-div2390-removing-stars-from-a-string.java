

class Solution {
    
    public String removeStars(String s){
        int i = 0;
        int n = s.length();
        StringBuilder result = new StringBuilder();
        
        while(i < n){
            if(s.charAt(i) != '*'){
                result.append(s.charAt(i));
            }
            else
                result.deleteCharAt(result.length() -1);
            i++;
        }
        return result.toString();
    }
}