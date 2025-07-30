class Solution {
    public int maxArea(int[] height) {
        int maxArea= Integer.MIN_VALUE;
        int i=0;
        int j= height.length-1;
        while(i<j){
            int maxHeight= Math.min(height[i],height[j]);
            maxArea= Math.max(maxArea, maxHeight*(j-i));
            while (i < j && height[i] <= maxHeight) i++;
            while (i < j && height[j] <= maxHeight) j--;
        }
    return maxArea;
    }
}