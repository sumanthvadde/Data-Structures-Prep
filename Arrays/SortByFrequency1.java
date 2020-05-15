import java.util.*;
public class Comp implements Comparator<Integer>{
	HashMap<Integer,Integer> t;
	Comp(HashMap<Integer,Integer> a){
		this.t=a;
	}
	public int compareTo(Integer k1,Integer k2) {
		int freqVal= t.get(k1).compareTo(t.get(k2));
		int keyVal= k1.compareTo(k2);
		if(freqVal==0) {
			return keyVal;
		}
		else
            return freqVal; 
		
	}
}
public class SortByFrequency1 {
	public static void main(String args[]) {
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
		  
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        List<Integer> outputArray = new ArrayList<>(); 
  
        // Assign elements and their count in the list and map 
        for (int current : array) { 
            int count = map.getOrDefault(current, 0); 
            map.put(current, count + 1); 
            outputArray.add(current); 
        } 
        Comp comp = new Comp((map); 
        
        // Sort the map using Collections CLass 
        Collections.sort(outputArray, comp); 
  
        // Final Output 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        }
	}

}
