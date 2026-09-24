class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                if(nums[i]==i){
                    return i;
                }
            }
            else{
                int n=nums[i];
                int s=digitsum(n);
                if(s==i){
                    return i;
                }

            }
        }
        return -1;
    }
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
}