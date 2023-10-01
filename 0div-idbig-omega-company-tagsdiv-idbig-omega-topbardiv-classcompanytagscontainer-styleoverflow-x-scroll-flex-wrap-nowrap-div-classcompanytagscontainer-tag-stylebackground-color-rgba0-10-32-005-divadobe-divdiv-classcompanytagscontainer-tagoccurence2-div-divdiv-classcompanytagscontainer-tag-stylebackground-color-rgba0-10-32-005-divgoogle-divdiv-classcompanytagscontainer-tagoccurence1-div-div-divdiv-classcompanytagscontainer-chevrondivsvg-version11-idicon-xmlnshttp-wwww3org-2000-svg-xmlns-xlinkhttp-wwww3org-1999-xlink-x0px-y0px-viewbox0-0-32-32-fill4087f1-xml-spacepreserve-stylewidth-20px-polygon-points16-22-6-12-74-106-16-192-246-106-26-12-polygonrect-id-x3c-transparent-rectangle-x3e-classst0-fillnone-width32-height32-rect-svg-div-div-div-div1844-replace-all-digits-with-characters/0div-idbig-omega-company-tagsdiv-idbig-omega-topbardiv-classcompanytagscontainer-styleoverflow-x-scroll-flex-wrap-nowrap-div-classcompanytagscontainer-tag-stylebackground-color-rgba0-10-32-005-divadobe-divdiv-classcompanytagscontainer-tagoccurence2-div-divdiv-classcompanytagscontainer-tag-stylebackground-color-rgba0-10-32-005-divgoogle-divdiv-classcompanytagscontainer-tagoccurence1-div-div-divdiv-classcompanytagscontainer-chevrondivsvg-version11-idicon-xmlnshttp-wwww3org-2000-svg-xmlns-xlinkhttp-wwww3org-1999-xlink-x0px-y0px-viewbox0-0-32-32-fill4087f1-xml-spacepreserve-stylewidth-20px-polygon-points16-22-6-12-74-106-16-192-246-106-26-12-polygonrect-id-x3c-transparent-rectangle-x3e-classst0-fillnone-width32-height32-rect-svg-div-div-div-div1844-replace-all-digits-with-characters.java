

class Solution {
    
    
    public String replaceDigits(String s){
        StringBuilder t = new StringBuilder();
        
        for(int i=0; i<s.length();i++){
            if(i%2==0) t.append(s.charAt(i));
            else{
                char c = s.charAt(i-1);
                int x = s.charAt(i)-'0';
                char r = shift(c,x);
                t.append(r);
            }
        }
        return t.toString();
    }
    
    private char shift(char c, int x){
        return (char)(c+x);
    }
}