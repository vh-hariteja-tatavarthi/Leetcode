class Solution {

    public boolean check(double num){
        if(num<1.0) return false;
        if(num==1.0) return true;
        return check(num/2);
    }

    public boolean isPowerOfTwo(int n) {

        double num= (double) n;

        return check(num);      
    }
}