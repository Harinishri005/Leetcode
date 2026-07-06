class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuffer str=new StringBuffer();
        while(a>0||b>0){
            int len=str.length();
            if(len>=2&&str.charAt(len-1)==str.charAt(len-2)){
                if(str.charAt(len-1)=='a'){
                    str.append('b');b--;
                }
                else{
                    str.append('a');a--;
                }
            }
            else if(a>b){
                str.append('a');a--;
            }
            else if(b>0){
                str.append('b');b--;
            }
        }return str.toString();
    }
}