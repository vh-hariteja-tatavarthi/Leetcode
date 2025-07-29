import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();

        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String keys = new String(arr);

            if(!answer.containsKey(keys)) {
                answer.put(keys, new ArrayList<>());
            }
            answer.get(keys).add(str);
        }

        return new ArrayList<>(answer.values());
    }
}