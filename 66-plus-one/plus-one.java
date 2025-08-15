class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        ArrayList<Integer> res= new ArrayList<>();
        res.add((digits[n-1]+1)%10);
        int carry= (digits[n-1]+1>9?1:0);
        for(int i=n-2;i>=0;i--){
            int ans= digits[i]+carry;
            if(ans>9){
                carry=1;
                ans=ans-10;
            }
            else{
                carry=0;
            }
            res.add(ans);
        }
        if(carry==1) res.add(1);
        int[] result=new int[res.size()];
        for(int i=0;i<result.length;i++){
            result[i]= res.get(result.length-1-i);
        }
        return result;
    }
}