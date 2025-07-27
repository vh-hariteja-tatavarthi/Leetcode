class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        // int cval=0;
        // int chill=0;
        // for(int i=1;i<nums.length-1;i++){
        //     int j=i;
        //     if(nums[i]==nums[i-1]){
        //         while(j>=1&&nums[j]==nums[j-1]){
        //             j--;
        //         }
        //         if(j<0) continue;
        //     }
        //     if(nums[i]==nums[i+1]){
        //         while(nums[i]==nums[i+1] &&i<nums.length){
        //             i++;
        //         }
        //         if(i>=nums.length) continue;
        //     }
        //     if(nums[i]>nums[i+1]&& nums[i]>nums[i-1]) chill++;
        //     if(nums[i]<nums[i+1]&& nums[i]<nums[i-1]) cval++;
        // }
        // return cval+chill;
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) arr.add(nums[i]);
        }
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i-1)&&arr.get(i)>arr.get(i+1)) c++;
            if(arr.get(i)<arr.get(i-1)&&arr.get(i)<arr.get(i+1)) c++;
        }
        return c;
    }
}