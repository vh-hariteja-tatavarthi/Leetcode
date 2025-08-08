class Solution {
    public String reverseWords(String s) {
        System.out.println(s.length());
        s= s.trim();
        s = s.replaceAll("\\s+", " ");
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();
        System.out.println(s.length());
        int i= s.length()-1;

        while(i>=0){
            if(s.charAt(i)==' '){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(" ");
                i--;
                continue;  
            }else{
                st.add(s.charAt(i));
                i--;
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.print(sb);

        return sb.toString();

        
    }
}