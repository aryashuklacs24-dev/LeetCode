class Solution {
    public int minAddToMakeValid(String s) {
        return fun(s);
    }
    public static int fun(String s){
        int oc=0;
        int ans=0;
        // int cc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                oc++;
            }
            else {

                if(oc>0){
                    oc--;
                }
                else{
                    ans++;
                }
            
            }
        }

        return ans+oc;
    }
}