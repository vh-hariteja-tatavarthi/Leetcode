class Solution {
    public int[] sumZero(int n) {
        int[] res= new int[n];
        if(n==1) return new int[]{0};
        for(int i=0; i<n/2;i++){
            res[i]=-(n/2-i);
            res[n-1-i]= (n/2-i);
        }
        if(n%2!=0) res[n/2]= 0; 
        return res;      
    }
}