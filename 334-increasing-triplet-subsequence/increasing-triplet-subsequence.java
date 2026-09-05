class Solution {
    public boolean increasingTriplet(int[] arr) {
        int fst=Integer.MAX_VALUE;
        int snd=Integer.MAX_VALUE;
        for(int n:arr){
            if(n<=fst){
                fst=n;
            }
            else if(n<=snd){
                snd=n;
            }
            else{
                return true;
            }
        }
        return false;
    }
}