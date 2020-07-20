import java.util.*;
import java.lang.*;
import java.io.*;

class OneStringInAnother{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    int len1 = s.length();
		    int len2 = t.length();
		    
		    
		    // if length of pattern is greater than length of string
		    if(len1 < len2){
		        System.out.println("-1");
		        test--;
		        continue;
		    }
		    
		    // count occurrence of characters of string 
            // start traversing the string
		    int[] hash_pat = new int[256];
		    int[] hash_str = new int[256];
		    
		    
		    for(int i = 0; i < len2; i++){
		        hash_pat[t.charAt(i)]++;
		    }
		    
		    int start = 0;
		    int start_index = -1;
		    int min_len = Integer.MAX_VALUE;
		    int count = 0;
		    
		    // count occurrence of characters of string 
            // start traversing the string
		    for(int j = 0; j < len1; j++){
		        hash_str[s.charAt(j)]++;
		        
		        if(hash_pat[s.charAt(j)] != 0 
		        && hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)]){
		            count++;
		        }
		        
		        // if all the characters are matched 
		        if(count == len2){
		            
		            // Try to minimize the window i.e., check if 
			        // any character is occurring more no. of times 
			        // than its occurrence in pattern, if yes 
			        // then remove it from starting and also remove 
			        // the useless characters. 
		            while(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)] ||
		                hash_pat[s.charAt(start)] == 0)
		                {
		                    if(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)]){
		                        hash_str[s.charAt(start)]--;
		                    }
		                    start++;
		                }
		                
		                int len_window = j - start + 1;
		                
		                // update window size 
		                if(min_len > len_window){
		                    min_len = len_window;
		                    start_index = start;
		                }
		        }
		        
		    }
		    
		    // if no window found
		    if(start_index == -1){
		        System.out.println(-1);
		    } else{
		        System.out.println(s.substring(start_index, start_index + min_len));
		    }
		    
		    
		    test--;
		}
	}
}