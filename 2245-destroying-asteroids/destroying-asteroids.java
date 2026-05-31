class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long currMass = mass;

        for(int x : asteroids){

            if(currMass >= x){
                currMass += x;
            }
            else{
                return false;
            }
        }

        return true;
    }
}