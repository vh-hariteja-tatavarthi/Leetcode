class Solution {
    public boolean isPalindrome(String s) {
        // Use StringBuilder to store filtered characters
        StringBuilder sb = new StringBuilder();

        // Filter only alphanumeric characters and convert to lowercase
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        // Two-pointer check
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
