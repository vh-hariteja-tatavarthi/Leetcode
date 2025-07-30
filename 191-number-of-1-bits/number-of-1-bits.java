class Solution {
    public int hammingWeight(int n) {
        String s= Integer.toBinaryString(n);
        int freq=0;
        for(char ch: s.toCharArray()){
            if(ch=='1') freq++;
        }
        return freq;
    }
}