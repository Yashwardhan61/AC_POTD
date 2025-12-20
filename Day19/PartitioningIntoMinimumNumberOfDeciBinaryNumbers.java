package Day19;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = 0;
        int len = n.length();

        for (int i = 0; i < len; i++) {
            int digit = Integer.parseInt(n.substring(i, i + 1));// Fastest way to use instead of this line " int digit = n.charAt(i) - '0';"
            if (digit > max) 
                max = digit;
            if (max == 9)   
                return 9;
        }
        return max;
    }
}//TC=O(n)
