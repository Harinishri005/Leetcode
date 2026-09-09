class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        for(int right=0; right<=arr.length; right++){
            if(right==arr.length || arr[right]==' '){
                int end=right-1;
                while(left<end){
                    char temp=arr[left];
                    arr[left]=arr[end];
                    arr[end]=temp;
                    left++;
                    end--;
                }
                left=right+1;
            }
        }
        return new String(arr);
    }
}