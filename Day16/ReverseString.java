package Day16;

public class ReverseString {
    public String reverseWords(String s) {

        String[] words = new String[s.length()];
        int index = 0;
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index++] = word;
        }

        String result = "";
        for (int i = index - 1; i >= 0; i--) {
            result = result + words[i];
            if (i != 0) {
                result = result + " ";
            }
        }

        return result;
    }
}
// time complexity=O(n²)