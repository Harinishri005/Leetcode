class Solution {
    public int maxNumberOfBalloons(String tex) {
        int b=0,a=0,l=0,o=0,n=0;
        char[] text=tex.toCharArray();
        for(char c:text){
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++; 

        }
        return Math.min(n,Math.min(Math.min(b,a),Math.min(l/2,o/2)));
    }
}