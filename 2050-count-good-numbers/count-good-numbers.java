class Solution {
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans1 = power(5, even);
        long ans2 = power(4, odd);

        return (int)((ans1 * ans2) % 1000000007);
    }
    public long power(long a, long b) {

        long ans = 1;
        long mod = 1000000007;
        while(b > 0) {
            if(b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }

        return ans;
    }
}