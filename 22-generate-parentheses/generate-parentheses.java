class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        paren(n, 0, 0, "", res);
        return res;
    }

    public void paren(int n, int open, int closed, String ans, List<String> res) {
        if (open == n && closed == n) {
            res.add(ans);
            return;
        }

        if (closed > open || open > n) {
            return;
        }

        paren(n, open + 1, closed, ans + "(", res);
        paren(n, open, closed + 1, ans + ")", res);
    }
}
