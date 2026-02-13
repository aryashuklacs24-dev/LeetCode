class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s=0;
        for(int x:apple){
            s+=x;
        }
        Arrays.sort(capacity);
        int c=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(s>0){
                c++;
                s-=capacity[i];
                if(s<=0){
                    return c;
                }
            }
        }
       return c;
    }
}