class Solution {
    public String largestGoodInteger(String num) {
        String best = "";
        int n = num.length();

        for (int i = 0; i < n; ) {
            char c = num.charAt(i);
            int j = i;
            while (j < n && num.charAt(j) == c) j++;

            // Check if we have exactly 3 equal digits
            if (j - i >= 3) {
                String candidate = "" + c + c + c;
                if (best.isEmpty() || candidate.compareTo(best) > 0) {
                    best = candidate;
                }
            }
            i = j; // skip over this run
        }
        return best;
    }
}
