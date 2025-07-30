class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp= nums[i];
            nums[i]= nums[j];
            nums[j]=temp;
        }
        int s=i+1;
        int e=nums.length-1;
        while(s<e){
            int temp= nums[s];
            nums[s]= nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}