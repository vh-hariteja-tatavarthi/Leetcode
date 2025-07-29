class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1= frequency(s);
        int[] freq2= frequency(t);
        if(Arrays.equals(freq1,freq2)) return true;
        return false; 
    }
    public int[] frequency(String str){
        int[] res= new int[26];
        for(char ch:str.toCharArray()){
            res[ch-'a']++;            
        }
        return res;
    }
}