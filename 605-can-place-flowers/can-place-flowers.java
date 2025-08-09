class Solution {
    public boolean canPlace(int i, int[] flowerbed){
        if(flowerbed[i]==1||(i>0&&flowerbed[i-1]==1)||(i<flowerbed.length-1&&flowerbed[i+1]==1)) return false;

        return true;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0) return true;

        for(int i=0;i<flowerbed.length;i++){
            if(canPlace(i,flowerbed)){
                flowerbed[i]=1;
                n--;
            }
            if(n==0) return true;
            
        }

        return false;
    }
}