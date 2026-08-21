class TimeMap {
    private Map<String, Map<Integer, String>> keyStorage;
    public TimeMap() {
        keyStorage = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyStorage.containsKey(key)){
            keyStorage.put(key, new HashMap<>());
        }
        keyStorage.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {

        if(!keyStorage.containsKey(key)){
        return "";
        }

        int seen = -1;

        for(int time : keyStorage.get(key).keySet()){

            if(time <= timestamp){
            seen = Math.max(seen, time);
            }

        }

        if(seen == -1) return "";

        return keyStorage.get(key).get(seen);
    }
}
