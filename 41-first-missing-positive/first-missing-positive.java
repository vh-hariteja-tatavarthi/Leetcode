class Solution {
    public int firstMissingPositive(int[] nums) {
        int max= Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            max= Math.max(max,num);
            set.add(num);
        }
        System.out.println(set);
        System.out.println(max);

        if(max<0) return 1;

        for(int i=1;i<max;i++){
            if(!set.contains(i)) return i;
        }


        return max+1;
    }
}