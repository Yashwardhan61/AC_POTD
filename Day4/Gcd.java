package Day4;

public class Gcd {
    public int findGCD(int[] num) {
        int n=num.length;
        int max=0;
        int min=num[1];
        int gcd=1;
        for(int i=0;i<n;i++){
            if(num[i]<min)
            min=num[i];
    
        if (num[i]>max)
        max=num[i];
    }
      for(int i=1;i<=min;i++){
        if((max%i==0)&&(min%i==0)){
            gcd=i;
        }
    }
   // System.out.println(min);

    //System.out.println(max);
return gcd;
    }
}//Time complexity=O(n + log min)