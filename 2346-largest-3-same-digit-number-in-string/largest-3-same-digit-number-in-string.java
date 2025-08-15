class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb= new StringBuilder();
        int start=0;
        while(start<num.length()-3+1){
            int end=start;
            while(end-start<3){
                if(num.charAt(end)==num.charAt(start)) end++;
                else break;
            }
            if(end-start==3){
                if(sb.length()==0||num.charAt(start)>sb.charAt(0)){
                    sb.setLength(0);
                    sb.append(num.substring(start,end));
                }
            }
            while(start<end){
                start++;
            }
        }
        return sb.toString();    
    }
}