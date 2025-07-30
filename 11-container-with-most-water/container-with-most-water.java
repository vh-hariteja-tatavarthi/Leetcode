class Solution {
    public int maxArea(int[] height) {
        int maxArea= Integer.MIN_VALUE;
        int i=0;
        int j= height.length-1;
        while(i<j){
            int maxHeight= Math.min(height[i],height[j]);
            maxArea= Math.max(maxArea, maxHeight*(j-i));
            if(height[i]<height[j]) i++;
            else j--; 
        }
    return maxArea;
    }
}