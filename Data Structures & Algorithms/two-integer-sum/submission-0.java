class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        //For our seen hashmap to see if difference exists
        for(int i = 0; i<nums.length; i++){
            seen.put(nums[i],i);
        }

        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(seen.containsKey(difference) && seen.get(difference) != i)
            return new int[]{i, seen.get(difference)};
        }
            return new int[0];
    }
}
