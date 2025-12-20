package Day18;

public class StringsRotationsofEachOther {
       public boolean areRotations(String s1, String s2) {

        String combined = s2 + "$" + s1 + s1;
        int n = combined.length();
        int[] z = new int[n];

        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }

            while (i + z[i] < n &&
                   combined.charAt(z[i]) == combined.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }

            if (z[i] == s2.length()) return true;
        }
        return false;
    }
}//Time Complexity=O(n + m)


