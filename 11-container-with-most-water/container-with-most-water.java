class Solution {
    public int maxArea(int[] height) {
        return fun(height);
        
    }
     public static int fun(int[]arr){
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left], arr[right]);
            int currentarea =height*width;
            maxarea=Math.max(maxarea, currentarea);

             if(arr[left]<arr[right]){
            left++;
        }else{
            right--;
        }
        }
        return maxarea;
    }
}