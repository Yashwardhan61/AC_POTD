package Day19;

public class StringCompressionIIIS1 {
    public String compressedString(String word) {
        String comp = "";
        char prev = 0;
        int count = 0;

        for (char ch : word.toCharArray()) {

            if (ch == prev && count < 9) {
                count++;
            } else {
                if (count > 0) {
                    comp += count + "" + prev;
                }
                prev = ch;
                count = 1;
            }
        }

        comp += count + "" + prev;

        return comp;
    }
}//TC=O(N)

