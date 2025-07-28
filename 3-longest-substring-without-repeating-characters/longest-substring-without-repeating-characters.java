class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int maxlength = 0;
        char[] chars = s.toCharArray();
        int start = 0;
        for (int end = 0; end < chars.length; end++) {
            // if (!hs.contains(chars[end])) {
            //     hs.add(chars[end]);
            //     maxlength = Math.max(hs.size(), maxlength);
            // } else if (hs.contains(chars[end])) {

                while (hs.contains(chars[end])) {
                    hs.remove(chars[start]);
                    start++;
                }
                hs.add(chars[end]);
                maxlength = Math.max(hs.size(), maxlength);
            }
                    return maxlength;

        }


    }