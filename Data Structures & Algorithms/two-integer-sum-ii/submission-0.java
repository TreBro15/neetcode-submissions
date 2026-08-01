class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beg = 0, end = numbers.length -1;
        while(beg < end){
            int sum = numbers[beg] + numbers[end];
            if(sum < target)
            beg++;
            else if(sum > target)
            end--;
            else return new int[] { beg + 1, end + 1};
        }
        return new int[0];
    }
}
