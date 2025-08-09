class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map= new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.print(map);

        int maxOdd= 0;
        int result=0;

        for(int val: map.values()){

            if(val%2==0) result+=val;
            else{

                result+=val-1;

                maxOdd= Math.max(maxOdd,val);
            }
        }

        if(maxOdd==0) return result;


        return ++result;
    }
}