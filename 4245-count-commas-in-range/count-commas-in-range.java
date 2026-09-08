class Solution {
    public int countCommas(int n) {
        int comma=0;
        if(n<1000){
            return 0;
        }
        else{
            int i=1000;
           while(i<=n){
            int digits=digit(i);
            comma=comma+((digits-1)/3);
            i++;
           }

        }
        return comma;
    }
    public static int digit(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;

        }
        // int d=n%10
        return c;
    }
}