class Solution {
    public int maxArea(int[] height) {
        int maxA=0;int n=height.length;
        int i=0,j=n-1;
        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            maxA=Math.max(maxA,area);
            if(height[i]<height[j])i++;
            else j--;
        }return maxA;
    }
}