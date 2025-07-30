class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int k=0;
       for(int i=nums1.length-nums2.length;i<nums1.length;i++){
        nums1[i]=nums2[k];
        k++;
       }
       Arrays.sort(nums1);
    }
}