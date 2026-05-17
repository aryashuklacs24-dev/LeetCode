class Solution {
    public int[] nextGreaterElements(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 2*n-1; i >= 0; i--) {

            while(!st.isEmpty() &&
                  arr[i % n] >= arr[st.peek()]) {
                st.pop();
            }

            if(i < n) {
                if(st.isEmpty()) {
                    ans[i] = -1;
                }
                else {
                    ans[i] = arr[st.peek()];
                }
            }

            st.push(i % n);
        }

        return ans;
    }
}