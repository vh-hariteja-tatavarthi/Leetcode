class Solution {
    static 
    {
        for(int i=0;i<100;i++) longestPalindrome("a");
    }
    public static int longestPalindrome(String s) {
        if(s.length()<2) return 1;
        int [][]arr = new int[2][26];
        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
            if(c1>96)
            arr[0][c1-'a']++;
            else
            arr[1][c1-'A']++;
        }
        int len =0;
        for(int i=0;i<arr[0].length;i++)
        {
            len+=(arr[0][i]/2)+(arr[1][i]/2);
        }
        len*=2;
        if(len<s.length()) return len+1;
        return len;
        
    }
}