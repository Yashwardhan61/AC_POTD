package Day6;

class q1 {
    public String removeOuterParentheses(String s) {
        String r="";
        int d=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(d>0){
                    r=r+c;
                }
                d++;
            }else{
                d--;
                if(d>0){
                    r=r+c;
                }
            }
        }
return r;
    }
}
//time complexity 0(n^2)