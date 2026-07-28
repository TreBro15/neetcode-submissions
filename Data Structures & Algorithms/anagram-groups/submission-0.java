class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> alph = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            alph.putIfAbsent(key, new ArrayList<>());
            alph.get(key).add(s);
        }
        return new ArrayList<>(alph.values());
    }
}
