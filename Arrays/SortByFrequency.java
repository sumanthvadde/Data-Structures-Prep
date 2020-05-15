import java.util.*;
public class SortByFrequency {
	public static TreeMap<Integer,Integer> getFirstIndex(int arr[]){
		TreeMap<Integer,Integer> h= new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],i);
			}
			else {
				continue;
			}
		}
		return h;
	}
	
	public static TreeMap<Integer,Integer> getCount(int arr[]){
		TreeMap<Integer,Integer> h= new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}
			else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}
		return h;
		
	}
	
	pubcl

}
