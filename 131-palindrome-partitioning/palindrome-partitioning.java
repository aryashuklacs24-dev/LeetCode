class Solution {
    public List<List<String>> partition(String ques) {
         List<String>ans=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();
        partitioning(ques, ans,res);
        return res;
    }
    public static void partitioning(String ques,List<String>ans,List<List<String>>res){
    if(ques.length()==0){
            // System.out.println(ans);
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0, i);
            if(isPal(s)){
                ans.add(s);
                partitioning(ques.substring(i), ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }
     public static boolean isPal(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}