class Solution {
    public int maxDepth(String s) {
        int d=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                d++;
                ans=Math.max(d,ans);
            }
            else if(c==')'){
                d--;
            }
        }
        return ans;
    }
}