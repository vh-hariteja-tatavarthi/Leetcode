class Solution {
    public String[] findWords(String[] words) {


        HashSet<Character> row1= new HashSet<>();
        for (char ch : "qwertyuiop".toCharArray()) {
            row1.add(ch);
        }

        HashSet<Character> row2= new HashSet<>();
        for(char ch: "asdfghjkl".toCharArray()){
            row2.add(ch);
        }

        HashSet<Character> row3= new HashSet<>();
        for(char ch: "zxcvbnm".toCharArray()){
            row3.add(ch);
        }

        HashMap<Integer,HashSet<Character>> mapper= new HashMap<>();


        mapper.put(1,row1);
        mapper.put(2,row2);
        mapper.put(3,row3);

        // System.out.println(row1);
        // System.out.println(row2);
        // System.out.println(row3);

        // for(char[] ch: mapper.values()){
        //     for(char c:ch){
        //         System.out.print(c+" ");
        //     }
        //     System.out.println();
        // }

        ArrayList<String> list= new ArrayList<String>();

        for(String str:words){
            char fchar= Character.toLowerCase(str.charAt(0));
            
            
            int row=0;            
            if(row1.contains(fchar)) row=1;
            else if(row2.contains(fchar)) row=2;
            else row=3;


            int i=1;

            while(i<str.length()){

                if(!mapper.get(row).contains(Character.toLowerCase(str.charAt(i)))) break;

                i++;

            }

            if(i>=str.length()) list.add(str);
        }

        System.out.println(list);

        String[] answer= new String[list.size()];
        list.toArray(answer);

        return answer;
        
    }
}