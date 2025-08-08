class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String check= x+"";

        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(check)) list.add(i);
        }
        return list;
    }
}