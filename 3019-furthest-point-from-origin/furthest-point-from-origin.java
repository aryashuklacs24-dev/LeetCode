class Solution {
    public int furthestDistanceFromOrigin(String moves) {
      int L = 0;
      int R = 0;
      int underscore = 0;

for(int i = 0; i < moves.length(); i++){
    char ch = moves.charAt(i);
    
    if(ch == 'L') L++;
    else if(ch == 'R') R++;
    else underscore++;
}

int result = Math.abs(R - L) + underscore;

return result;
    }
}