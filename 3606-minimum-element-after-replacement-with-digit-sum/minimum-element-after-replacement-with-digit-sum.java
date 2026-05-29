class Solution {
    public int minElement(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int s=0;
        while(n>0){
            int d=n%10;
             s=s+d;
            n/=10;
        }
        nums[i]=s;
       }
       int min=nums[0];
       for(int x=1;x<nums.length;x++){
        if(nums[x]<min){
            min=nums[x];
        }
       }
       return min;
    }
}