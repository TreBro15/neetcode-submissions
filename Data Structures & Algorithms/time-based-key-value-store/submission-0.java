class TimeMap {
    private Map<String, Map<Integer, List<String>>> keyStorage;
    public TimeMap() {
        keyStorage = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyStorage.containsKey(key)){
            keyStorage.put(key, new HashMap<>());
        }

        if(!keyStorage.get(key).containsKey(timestamp)){
            keyStorage.get(key).put(timestamp, new ArrayList<>());
        }

        keyStorage.get(key).get(timestamp).add(value);
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

        int back = keyStorage.get(key).get(seen).size() - 1;

        return keyStorage.get(key).get(seen).get(back);
    }
}
