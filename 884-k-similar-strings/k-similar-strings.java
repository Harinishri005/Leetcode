class Solution {
    public int kSimilarity(String s1, String s2) {
        return kswap(s1.toCharArray(),s2,0);
    }
    int kswap(char[] s1,String s2,int i){
        if(s2.equals(s1.toString())) return 0;
        while(i<s1.length&&s2.charAt(i)==s1[i])i++;
        if(i==s1.length)return 0;
        int minK=Integer.MAX_VALUE;
        for(int j=i+1;j<s1.length;j++){
            if(s1[j]!=s2.charAt(j)&&s2.charAt(i)==s1[j])
            {
                char t=s1[i];s1[i]=s1[j];s1[j]=t;
                minK=Math.min(minK,1+kswap(s1,s2,i+1));
                t=s1[i];s1[i]=s1[j];s1[j]=t;

            }
        }return minK;
    }
    
}