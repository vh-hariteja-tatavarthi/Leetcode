class Solution {
    public int myAtoi(String s) {
        long num=0;
        int sign=1;
        s=s.replaceFirst("^\\s+","");
        // char[] arr= s.toCharArray();
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-') sign=-1;
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)=='-'||s.charAt(i)=='+') continue;
            }
            if(!Character.isDigit(s.charAt(i))) break;
            num=num*10+ (long) (s.charAt(i)-'0');
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(s.charAt(0)=='-') num=num*-1;
        return (int) num;
    }
}