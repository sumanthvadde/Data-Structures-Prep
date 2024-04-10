class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level){
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(id);
        while(!q.isEmpty()){
            if(count == level){
                break;
            }
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int p = q.poll();
                for (int f : friends[p]) {
                    if (!visited.contains(f)) {
                        q.add(f);
                        visited.add(f);
                    }
                }
            }
            count++;
            
        }
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int p = q.poll();
            List<String> vs = watchedVideos.get(p);
            for (String v : vs) {
                map.put(v, map.getOrDefault(v, 0) + 1);
            }
        }
        for (String key : map.keySet()) {
            res.add(key);
        }
        Collections.sort(res, (a, b)->(map.get(a) == map.get(b) ? a.compareTo(b) : map.get(a) - map.get(b)));
        return res;
    }
}