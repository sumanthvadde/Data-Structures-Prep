import java.util.*;
class Comp implements Comparator<Integer>{
	HashMap<Integer, Integer> h1= new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> h2= new HashMap<Integer, Integer>();
	Comp(HashMap<Integer, Integer>h1, HashMap<Integer, Integer>h2){
		this.h1= h1;
		this.h2= h2;
	}
	public int compare(Integer a, Integer b) {
		int freqComp= h1.get(b).compareTo(h1.get(a));
		int indexComp= h2.get(a).compareTo(h2.get(b));
		if(freqComp==0) {
			return indexComp;
		}
		return freqComp;
	}
}

public class SortByFreq {
	public static void main(String[] args) 
    { 
  
        // Declare and Initialize an array 
        int[] arr = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
  
        HashMap<Integer, Integer> map1 = new HashMap<>(); 
        HashMap<Integer, Integer> map2 = new HashMap<>(); 
        List<Integer> output = new ArrayList<>();
        // Assign elements and their count in the list and map 
        for (int i=0; i<arr.length;i++) { 
            int count1 = map1.getOrDefault(arr[i], 0); 
            int count2 = map1.getOrDefault(arr[i], 0); 
            map1.put(arr[i], count1 + 1);
            map2.put(arr[i], count2 + 1); 
            output.add(arr[i]);
        } 
  
        // Compare the map by value 
        Comp comp = new Comp(map1, map2); 
  
        // Sort the map using Collections CLass 
        Collections.sort(output, comp); 
  
        // Final Output 
        for (Integer i : output) { 
            System.out.print(i + " "); 
        } 
    }
}
