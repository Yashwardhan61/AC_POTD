package Day15;

import java.util.HashMap;

public class ReverseVowel {

    public String reverseVowels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (char c : vowels) {
            map.put(c, 1);
        }
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            while (left < right && !map.containsKey(arr[left])) {
                left++;
            }
            
            while (left < right && !map.containsKey(arr[right])) {
                right--;
            }
            

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
}
//Time Complexity: O(n)

