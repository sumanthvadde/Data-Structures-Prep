class LongestPalindromicSubstring{

   public static String getPalindrome(String s, int low, int high){
		int len=s.length()-1;
		while(low>=0 && high<=len && s.chartAt(low)==s.charAt(high)){
			low--;
			high++;	
		}
	return s.substring(low+1,high);
    }
    public static String getResult(String s){
	String max_str = "", curr_str;

        int max_len= 0, curr_length;
	for(int i=0;i<s.length();i++){
	        curr_str= getPalindrome(s,i,i);
		int curr length=curr_str.length();
		if(curr_length>max_len){
			maxlen= curr_length;	
			max_str= curr_str;
  		}
		curr_str=getPalindrome(s,i,i+1);
		curr_length=curr_str.length();
		if(curr_length>max_len){ 
		max_len=curr_len;
		max_str=curr_str;
		}
 	}
	return max_str;
   }
   public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	String s= sc.next();
	System.out.println(getResult(s));
   }
}