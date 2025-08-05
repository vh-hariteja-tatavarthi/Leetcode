class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        int count = 0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    if(set.contains(j)) continue;

                    else{
                        count++;
                        set.add(j);
                        break;

                    }
                }
            }
        }
        System.out.println(set);
        return fruits.length-count;
        // for(int i: set) System.out.print(i+" ");
        // return fruits.length-set.size();        
    }
}