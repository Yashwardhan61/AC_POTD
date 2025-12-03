package Day3;
import java.util.*;
    class Two_out_Three {
    public List<Integer> twoOutOfThree(int[] num1, int[] num2, int[] num3) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>(); 
        HashSet<Integer>s3=new HashSet<>();
    for (int x : num1)
        s1.add(x);
        for (int x : num2)
        s2.add(x);
        for (int x : num3)
        s3.add(x);
        HashSet<Integer>re=new HashSet<>();
        for (int x : s1){
        if (s2.contains(x))
           re.add(x);
            }
            for (int x : s1){
        if (s3.contains(x))
           re.add(x);
            }
            for (int x : s2){
        if (s3.contains(x))
           re.add(x);
            }
            return new ArrayList<>(re);
             }
    }

//time complexcity=O(n+m+k)