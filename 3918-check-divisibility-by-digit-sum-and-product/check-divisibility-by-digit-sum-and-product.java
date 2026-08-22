class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int original=n;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
            product=product*digit;
        }
        if(original%(sum+product)==0){
            return true;
        }
        return false;
    }
}