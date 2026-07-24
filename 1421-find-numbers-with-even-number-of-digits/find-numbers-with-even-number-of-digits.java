class Solution {
    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int digitcount=0;
            while(n>0){
                digitcount++;
                n=n/10;
            }
            if(digitcount%2==0){
                evencount++;
            }
        }
        return evencount;
    }
}