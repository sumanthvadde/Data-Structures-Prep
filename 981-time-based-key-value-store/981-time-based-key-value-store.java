class TimeMap {
    // 20220815
    HashMap<String, TreeMap<Integer, String>> data;

    public TimeMap() {
        data = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!data.containsKey(key)) {
            data.put(key, new TreeMap<>());
        }
        data.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!data.containsKey(key)) return "";
        Integer floorKey = data.get(key).floorKey(timestamp);
        if (null == floorKey) return "";
        return data.get(key).get(floorKey);
    }
}