class Solution {
    public String longestPalindrome(String s) {
        int c=0;
        int max=0;
        int strt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPal(s,i,j)){
                    int diff=j-i+1;
                    if(diff>max){
                        max=diff;
                        strt=i;
                    }
                }
            }
        }
        return s.substring(strt,strt+max);
    }
    public static boolean isPal(String s,int l,int r){
         while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}