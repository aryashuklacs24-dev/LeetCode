class Solution {
    public int binaryGap(int n) {
        int ans =0;
        int prev=-1;
        int i=0;
        while(n>0){
            int r=n%2;
            if (r==1){
            if(prev==-1){
                prev=i;
            }
            else{
                ans=Math.max(i-prev,ans);
                prev=i;
                // i++;
            }
            }
            n/=2;
            i++;
        }
        return ans;
    }
}