/*
 Question: 
 Given a dictionary, and two words ‘start’ and ‘target’ (both of same length). Find length of the smallest chain 
 from ‘start’ to ‘target’ if it exists, such that adjacent words in the chain only differ by one character and each word 
 in the chain is a valid word i.e., it exists in the dictionary. It may be assumed 
 that the ‘target’ word exists in dictionary and length of all dictionary words is same.
 
 Solution: The idea is to use BFS. 
 We start from the given start word, traverse all words that adjacent 
 (differ by one character) to it and keep doing so until we find the target word or we have traversed all words.
 */

import java.util.*;
public class WordLadder {
	static int shortestChainList(String start, String target, Set<String> D) {
		if(!D.contains(target))
			return 0;
		int level=0;
		int wordlength= start.length();
		Queue<String> q= new LinkedList<String>();
		q.add(start);
		while(!q.isEmpty()) {
			++level; 
	        // Current size of the queue 
	        int sizeofq = q.size();
	        for(int i=0;i<sizeofq;i++) {
	        	String curr= q.poll();
	        	char a[]= curr.toCharArray();
	        	for(int j=0;j<a.length;j++) {
	        		char orignal= a[j];
	        		for(char c='a'; c< 'z';c++) {
	        			a[j]=c;
	        			if(String.valueOf(a).equals(target)) return level+1;
	        			if (!D.contains(String.valueOf(a))) 
	                        continue; 
	                    D.remove(String.valueOf(a));  
	                    q.add(String.valueOf(a));
	        		}
	        			a[j] = orignal;
	        	}
	        	
	        }
	        
			
		}
		return 0;
	}
}
