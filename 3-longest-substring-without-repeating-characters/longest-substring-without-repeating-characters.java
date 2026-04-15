class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            String ans = "";
            for(int j = i; j < s.length(); j++){
                if(ans.indexOf(s.charAt(j)) != -1){
                    break;
                }
                ans += s.charAt(j);
            }
            if(ans.length() > max){
                max = ans.length();
            }
        }
        return max;
    }
}
