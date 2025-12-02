package Day2;
class Baseball {
    public int calPoints(String[] op) {
        int sum=0;
        int s=op.length;
        int[] arr=new int[s];
        int idx=0;
        for(int i=0;i<s;i++){
            String x=op[i];
        if (Character.isDigit(x.charAt(0))||x.charAt(0)=='-'){
        int val=Integer.parseInt(x);
        arr[idx++]=val;
        sum=sum+val;
        }     
        else if (x.equals("+")){
            int val=arr[idx-1]+arr[idx-2];
            arr[idx++]=val;
            sum+=val;
        }
else if (x.equals("C")){
        int r=arr[--idx];
        sum=sum-r;
}
        else if (x.equals("D")){
            int val=arr[idx-1]*2;
            arr[idx++]=val;
            sum+=val;

        }
        }     
       return sum;
        }
}//Time Complexity=0(n)