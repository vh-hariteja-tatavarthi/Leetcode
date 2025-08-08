class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> mapper= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            char check= t.charAt(i);
            if(mapper.containsKey(ch)){


                if(t.charAt(i)!=mapper.get(ch)) return false;
            }
            else{
                if(mapper.containsValue(check)) return false;
                mapper.put(ch, t.charAt(i));
            }
        }

        return true;
    }
}