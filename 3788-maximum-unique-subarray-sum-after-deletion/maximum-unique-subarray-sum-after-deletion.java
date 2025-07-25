class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> freq= new HashMap<>();

        int max= nums[0];
        freq.put(nums[0],1);
        for(int i=1;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])==1){
                System.out.println(nums[i]);
                max=Math.max(max,Math.max(nums[i],max+nums[i]));
            }
        }
        return max;
    }
}