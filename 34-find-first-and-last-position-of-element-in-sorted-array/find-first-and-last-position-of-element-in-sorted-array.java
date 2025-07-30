class Solution {
    public int search(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int index = search(nums, 0, nums.length - 1, target);
        if (index == -1) return res;

        // Expand to the left
        int left = index;
        while (left >= 0 && nums[left] == target) {
            left--;
        }
        res[0] = left + 1;

        // Expand to the right
        int right = index;
        while (right < nums.length && nums[right] == target) {
            right++;
        }
        res[1] = right - 1;

        return res;
    }
}
