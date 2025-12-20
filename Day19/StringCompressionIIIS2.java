package Day19;
public class StringCompressionIIIS2 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();

        char prev = word.charAt(0);
        int count = 0;

        for (char ch : word.toCharArray()) {
            if (ch == prev && count < 9) {
                count++;
            } else {
                comp.append(count).append(prev);
                prev = ch;
                count = 1;
            }
        }

        comp.append(count).append(prev);
        return comp.toString();
    }
}//TC=O(N)

