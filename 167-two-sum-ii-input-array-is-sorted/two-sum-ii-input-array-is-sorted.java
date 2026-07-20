class Solution {
    public int[] twoSum(int[] arr, int target) {
        int s=0;
        int e = arr.length-1;
        int ans[]=new int [2];
        while(s<=e){
            if(arr[s]+arr[e]==target){
                ans[0]=s+1;
                ans[1]=e+1;
                break;
            }
            else if(arr[s]+arr[e]<target){
                s++;
            }
            else {
                e--;
            }
        }
        return ans;

    }
}