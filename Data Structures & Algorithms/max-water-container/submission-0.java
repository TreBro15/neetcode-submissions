class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int l = 0, r = heights.length -1;
        while(l<r){
            int maxH = Math.min(heights[l],heights[r]) * (r-l);
            result = Math.max(result,maxH);
            if(heights[l] <= heights[r]){
                l++;
            }
            else
            r--;
        }
        return result;
    }
}
