class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mapper= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!mapper.containsKey(ch)){
                mapper.put(ch,i);
            }
            else{
                mapper.put(ch,Integer.MIN_VALUE);
            }
        }
        int min= Integer.MAX_VALUE;

        System.out.println(mapper);

        for(int val:mapper.values()){
            if(val==0){
                min=0;
                break;            
            }
            if(val>0) min= Math.min(min,val);
        }

        if(min==Integer.MAX_VALUE) return -1;

        return min;


    }

}