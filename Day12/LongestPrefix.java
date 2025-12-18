package Day12;

import java.util.HashMap;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        HashMap<String, Integer> map = new HashMap<>();
        int n = strs.length;

        String first = strs[0];

        for (int i = 1; i <= first.length(); i++) {
            String prefix = first.substring(0, i);
            map.put(prefix, 1);
        }

        for (int i = 1; i < n; i++) {
            String word = strs[i];

            for (String key : map.keySet()) {
                if (word.startsWith(key)) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }

        String result = "";

        for (String key : map.keySet()) {
            if (map.get(key) == n) {
                if (key.length() > result.length()) {
                    result = key;
                }
            }
        }

        return result;
    }
}//TC=O(n × m²)

