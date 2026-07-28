class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hasher = new HashSet<>();
        for(int num: nums){
            if(hasher.contains(num))
            return true;
            else hasher.add(num);
        }
        return false;
    }
}