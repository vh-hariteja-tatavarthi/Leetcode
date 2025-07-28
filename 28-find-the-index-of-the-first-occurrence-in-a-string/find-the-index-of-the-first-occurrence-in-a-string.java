class Solution {
    static boolean isSame(String haystack, String needle){
        int i=0;
        while(i<haystack.length()&&i<needle.length()){
            if(needle.charAt(i)!=haystack.charAt(i)) return false;
            i++;
        }
        return true;

    }
    public int strStr(String haystack, String needle) {
        int i=0;
        char start= needle.charAt(0);
        while(i<=haystack.length()-needle.length()){
            if(haystack.charAt(i)==start){
                if(isSame(haystack.substring(i,i+needle.length()), needle)) return i;
            }
            i++;
        }
        return -1;
    }
}