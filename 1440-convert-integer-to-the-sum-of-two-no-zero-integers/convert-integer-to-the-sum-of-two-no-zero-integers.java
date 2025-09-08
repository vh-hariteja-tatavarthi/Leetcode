class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=n/2;
        int b=n-a;
        while(Integer.toString(a).contains("0")|| Integer.toString(b).contains("0")){
            a=a/2;
            b=n-a;
            System.out.println(a+" "+b);
        }

        return new int[]{a,b};

        
    }
}