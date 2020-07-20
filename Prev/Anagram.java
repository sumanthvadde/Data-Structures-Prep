import java.util.*;
public class Anagram {
	static boolean anagram(String str1, String str2) {
		if(str1.length()!= str2.length())
			return false;
		
		int count[]= new int[26];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
		}
		for(int i=0;i<str2.length();i++) {
			count[str1.charAt(i)-'a']--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	
		
	}
	static String func(String str) {
		int count[]= new int[26];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)-'a']++;
		}
		String res="";
		for(int i=0;i<count.length;i++) {
			res+=count[i];
		}
		return res;
	}
	
	static void anagramChecker(String arr[]) {
		HashMap<String,String> h= new HashMap<String,String>();
		for(int i=0;i<arr.length;i++) {
			String s= func(arr[i]);
			if(!h.containsKey(s)) {
				h.put(s,arr[i]);
			}
			else {
				h.remove(s);
			}
		}
		
		for(String x: h.keySet()) {
			System.out.println(h.get(x));
		}
	}
	public static void main(String args[]) {
		String arr[]= new String[] {"abc","bac","dab","bad","efgh"};
		anagramChecker(arr);
	}
}
