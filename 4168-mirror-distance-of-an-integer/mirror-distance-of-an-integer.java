class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        // int mul=1;
        int num=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==num){
            return 0;
        }
        return Math.abs(num-rev);
    }
}