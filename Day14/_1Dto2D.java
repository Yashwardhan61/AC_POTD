package Day14;

public class _1Dto2D {
    
    public int[][] construct2DArray(int[] original, int m, int t) {
        int n=original.length;
        int [][] arr1=new int[m][t];
        if (n!=m*t){
            return new int[0][0];
        }
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<t;j++){
                arr1[i][j]=original[index];
                index++;
            }
        }
return arr1;
    }
}//Time Complexity: O(n)

