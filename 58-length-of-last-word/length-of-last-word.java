class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        StringBuilder sb= new StringBuilder();
        for(int end= s.length()-1;end>=0;end--){
            if(s.charAt(end)==' ') return sb.length();
            sb.append(s.charAt(end));
        }
        return s.length();
    }
}