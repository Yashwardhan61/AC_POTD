package Day7;

import java.util.Arrays;

public class Trains {
    public int minPlatform(int arr[], int dep[]) {
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0;
        int c=0;
        int plat=0;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                c++;
                i++;
            }
            else{
                c--;
                j++;
            }
            if(c>plat){
                plat=c;
            }
            }
            
        return plat;
    }
}

