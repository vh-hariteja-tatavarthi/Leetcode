class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb= new StringBuilder();
        int flag= (num>=0?1:-1);
        if(num==0) return "0";
        if(flag==-1) num=num*flag;
        while(num>0){
            sb.append(num%7);
            num=num/7;
        }
        if(flag==-1) sb.append('-');

        return sb.reverse().toString();
        
    }
}