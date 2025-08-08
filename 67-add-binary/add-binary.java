class Solution {
    public String addBinary(String a, String b) {

        int carry=0;
        StringBuilder result= new StringBuilder();

        int len2= b.length();
        int len1= a.length();


        while(len2>len1){
            a='0'+a;
            len1++;
        }

        while(len1>len2){
            b='0'+b;
            len2++;
        }

        System.out.println(a+" "+b);

        for(int i=len2-1;i>=0;i--){

            System.out.print(carry+"  ");
            int add = carry+ (a.charAt(i)-'0')+ (b.charAt(i)-'0');
            if(add==0){
                carry=0;
                result.append('0');
            }
            else if(add==1){
                carry=0;
                result.append('1');
            }
            else if(add==2){
                carry=1;
                result.append('0');
                
            }
            else if(add==3){
                carry=1;
                result.append('1');
            }
        }
        if(carry==1) result.append('1');
        return result.reverse().toString();
    } 
}