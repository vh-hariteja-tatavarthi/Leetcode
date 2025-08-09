class Solution {
    public String triangleType(int[] nums) {

        Arrays.sort(nums);

        
        for(int num:nums) System.out.print(num+" ");

        if(nums[0]+nums[1]<=nums[2]) return "none";

        if(nums[0]==nums[1]&& nums[1]==nums[2]) return "equilateral";

        if(nums[0]==nums[1]&& nums[1]!=nums[2]) return "isosceles";

        if(nums[0]!=nums[1]&& nums[1]==nums[2]) return "isosceles";

 

        if(nums[0]!=nums[1]&& nums[1]!=nums[2]) return "scalene";



        return "equilateral";
        
    }
}