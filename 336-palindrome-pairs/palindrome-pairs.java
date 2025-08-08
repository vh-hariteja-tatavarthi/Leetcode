class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<String, Integer> mapper = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            mapper.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String s = words[i];

            for (int k = 0; k <= s.length(); k++) {
                String left = s.substring(0, k);
                String right = s.substring(k, s.length());


                if (isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();

                    if (mapper.containsKey(reversedRight)) {

                        int j=mapper.get(reversedRight);
                        if(i!=j){
                            List<Integer> arr = Arrays.asList(j,i);
                            result.add(arr);
                        }
                    }
                }
                if(!right.isEmpty()&& isPalindrome(right)){
                    String reversedLeft= new StringBuilder(left).reverse().toString();

                    if(mapper.containsKey(reversedLeft)){
                        int j= mapper.get(reversedLeft);
                        if(i!=j){
                            List<Integer> arr= Arrays.asList(i,j);
                            result.add(arr);
                        }
                    }
                }
            }
        }
        return result;
    }
}