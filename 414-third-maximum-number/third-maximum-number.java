class Solution {
    public int thirdMax(int[] nums) {
        long largest=Long.MIN_VALUE;
        long secondLargest=Long.MIN_VALUE;
        long thirdLargest=Long.MIN_VALUE;
        for(int i:nums){
            if(i>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=i;
            }
            else if(i>secondLargest && i!=largest){
                thirdLargest=secondLargest;
                secondLargest=i;
            }
            else if(i>thirdLargest && i!=secondLargest && i!=largest){
                thirdLargest=i;
            }

        }
        return thirdLargest==Long.MIN_VALUE ? (int)largest: (int)thirdLargest;
    }
}