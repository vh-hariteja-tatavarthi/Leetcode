class Solution {
    public int maximum69Number (int num) {
        String str= String.valueOf(num);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            if(str.charAt(i)=='6'){
                sb.setLength(i);
                sb.append("9");
                sb.append(str.substring(i+1));
                break;
            }
        }

        return Integer.parseInt(sb.toString());
        
    }
}