class Solution {
    public int titleToNumber(String columnTitle) {
        StringBuilder sb= new StringBuilder(columnTitle);
        sb.reverse();
        int col=0;
        for(int i=0;i<sb.length();i++){
            col= col+ (int)((int)(sb.charAt(i)-'A'+1)*Math.pow(26,i));
        }
        return col;
    }
}