class Solution {
    public int myAtoi(String s) {
        long num=0;
        int sign=1;
        s=s.replaceFirst("^\\s+","");
        char[] arr= s.toCharArray();
        if(arr.length==0) return 0;
        if(arr[0]=='-') sign=-1;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]=='-'||arr[i]=='+') continue;
            }
            if(!Character.isDigit(arr[i])) break;
            num=num*10+ (long) (arr[i]-'0');
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(arr[0]=='-') num=num*-1;
        return (int) num;
    }
}