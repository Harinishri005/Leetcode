class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return gcd(min,max);
    }
    public int gcd(int min,int max){
            if(max==0){
                return min;
            }
            return gcd(max,min%max);
    }
}