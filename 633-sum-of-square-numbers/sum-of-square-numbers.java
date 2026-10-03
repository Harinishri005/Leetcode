class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0;
        int right=(int) Math.sqrt(c);
        while(left<=right){
            long sum=(long)(left*left)+(long)(right*right);
            if(sum<c){
                left++;
            }
            else if(sum>c){
                right--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}