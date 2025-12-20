package Day17;
class CompareVersionNum {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int n;
        if (v1.length > v2.length) {
            n = v1.length;
        } else {
            n = v2.length;
        }

        for (int i = 0; i < n; i++) {

            String s1 = (i < v1.length) ? removeLeadingZeros(v1[i]) : "0";
            String s2 = (i < v2.length) ? removeLeadingZeros(v2[i]) : "0";

            if (s1.length() < s2.length()) 
                return -1;
            if (s1.length() > s2.length())
                return 1;

            int cmp = s1.compareTo(s2);
            if (cmp < 0) 
                return -1;
            if (cmp > 0) 
                return 1;
        }

        return 0;
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        return (i == s.length()) ? "0" : s.substring(i);
    }
}//TC=O(n)