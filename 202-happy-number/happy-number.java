class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (n == 4) return false;

        return isHappy(next(n));
    }

    private int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
