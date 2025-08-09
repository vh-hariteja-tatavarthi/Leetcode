class Solution:
    def findMaxLength(self, nums):
        prefix_sum = 0
        first_occurrence = {0: -1}  # prefix_sum → first index
        max_length = 0

        for i, num in enumerate(nums):
            prefix_sum += 1 if num == 1 else -1
            if prefix_sum in first_occurrence:
                max_length = max(max_length, i - first_occurrence[prefix_sum])
            else:
                first_occurrence[prefix_sum] = i

        return max_length
