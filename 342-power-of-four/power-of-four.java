class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;  // negative and zero not allowed
        while (n > 1) {
            if (n % 4 != 0) return false;
            n /= 4;
        }
        return true;
    }
}
