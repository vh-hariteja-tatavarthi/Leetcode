class Solution {

    public boolean isPowerOfThree(int n) {
        double num= (double) n;
        while(num>=1){
            if(num==1) return true;
            num=num/3;
        }
        return false;
    }
}