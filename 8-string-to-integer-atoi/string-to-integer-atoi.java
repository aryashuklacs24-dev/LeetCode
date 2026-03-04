class Solution {

    int i = 0;          // global pointer
    int sign = 1;
    long num = 0;

    public int myAtoi(String s) {
        skipSpaces(s);
        handleSign(s);
        buildNumber(s);
        return (int)(sign * num);
    }

    // 1. Skip leading spaces
    private void skipSpaces(String s) {
        if (i < s.length() && s.charAt(i) == ' ') {
            i++;
            skipSpaces(s);
        }
    }

    // 2. Handle optional sign
    private void handleSign(String s) {
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }
    }

    // 3. Recursively build number
    private void buildNumber(String s) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return;
        }

        int digit = s.charAt(i) - '0';

        // Overflow check
        if (num > (Integer.MAX_VALUE - digit) / 10) {
            num = (sign == 1) ? Integer.MAX_VALUE : -(long)Integer.MIN_VALUE;
            return;
        }

        num = num * 10 + digit;
        i++;

        buildNumber(s); // recursive call
    }
}
