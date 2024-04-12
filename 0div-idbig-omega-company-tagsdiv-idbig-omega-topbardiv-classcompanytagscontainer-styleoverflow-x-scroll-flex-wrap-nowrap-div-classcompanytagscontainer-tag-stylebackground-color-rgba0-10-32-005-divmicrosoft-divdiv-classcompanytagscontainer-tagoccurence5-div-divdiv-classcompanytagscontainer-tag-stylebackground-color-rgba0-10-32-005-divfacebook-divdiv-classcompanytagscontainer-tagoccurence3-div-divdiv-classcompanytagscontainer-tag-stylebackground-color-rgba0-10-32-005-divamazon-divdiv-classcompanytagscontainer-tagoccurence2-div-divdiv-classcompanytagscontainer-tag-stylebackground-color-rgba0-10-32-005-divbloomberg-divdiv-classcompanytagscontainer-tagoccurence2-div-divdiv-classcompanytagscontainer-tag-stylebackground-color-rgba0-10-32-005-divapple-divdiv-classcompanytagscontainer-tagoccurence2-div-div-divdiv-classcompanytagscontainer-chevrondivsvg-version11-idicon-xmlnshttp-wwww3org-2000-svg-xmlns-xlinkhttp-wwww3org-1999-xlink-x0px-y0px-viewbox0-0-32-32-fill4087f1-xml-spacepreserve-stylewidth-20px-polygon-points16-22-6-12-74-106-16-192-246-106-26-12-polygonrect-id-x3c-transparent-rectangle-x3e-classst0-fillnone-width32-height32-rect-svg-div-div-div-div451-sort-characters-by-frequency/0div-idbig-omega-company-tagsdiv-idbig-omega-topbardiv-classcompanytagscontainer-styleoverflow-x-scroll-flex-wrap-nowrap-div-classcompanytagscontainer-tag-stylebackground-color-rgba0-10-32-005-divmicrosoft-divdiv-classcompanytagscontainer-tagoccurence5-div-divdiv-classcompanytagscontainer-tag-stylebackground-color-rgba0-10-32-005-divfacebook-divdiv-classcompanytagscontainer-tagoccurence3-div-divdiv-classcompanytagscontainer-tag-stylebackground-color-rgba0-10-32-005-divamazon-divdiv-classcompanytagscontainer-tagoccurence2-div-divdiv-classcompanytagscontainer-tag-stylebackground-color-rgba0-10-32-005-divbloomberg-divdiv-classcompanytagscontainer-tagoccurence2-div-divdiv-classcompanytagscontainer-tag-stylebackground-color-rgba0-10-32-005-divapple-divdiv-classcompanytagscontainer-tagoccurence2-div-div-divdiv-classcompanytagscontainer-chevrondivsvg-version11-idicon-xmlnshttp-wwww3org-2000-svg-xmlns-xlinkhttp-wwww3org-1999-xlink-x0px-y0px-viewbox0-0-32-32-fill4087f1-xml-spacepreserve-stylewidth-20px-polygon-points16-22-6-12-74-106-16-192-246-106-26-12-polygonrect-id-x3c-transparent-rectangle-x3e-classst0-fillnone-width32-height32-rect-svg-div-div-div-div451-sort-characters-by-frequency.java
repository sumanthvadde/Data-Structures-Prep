class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> charFreq = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pQueue = new PriorityQueue<>
        ((a,b) -> b.getValue() - a.getValue());

        pQueue.addAll(charFreq.entrySet());
        System.out.println(charFreq);
        StringBuilder sb = new StringBuilder();

        while(!pQueue.isEmpty())
        {
            Map.Entry<Character, Integer> entry = pQueue.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));

        }
      

  return sb.toString();
    }
}