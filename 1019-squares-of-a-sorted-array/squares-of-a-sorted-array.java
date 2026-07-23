class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                nums[left]*=nums[left];
                result[index]=nums[left];
                left++;
                index--;

            }
            else{
                nums[right]*=nums[right];
                result[index]=nums[right];
                right--;
                index--;
            }
        }
        return result;
    }
}