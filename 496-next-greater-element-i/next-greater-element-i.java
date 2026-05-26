class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums2.length];

        for(int i=0;i<nums2.length;i++){

            while(!st.isEmpty() &&
                  nums2[i] > nums2[st.peek()]){

                nge[st.pop()] = nums2[i];
            }

            st.push(i);
        }

        while(!st.isEmpty()){
            nge[st.pop()] = -1;
        }

        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){

            for(int j=0;j<nums2.length;j++){

                if(nums1[i] == nums2[j]){
                    ans[i] = nge[j];
                    break;
                }
            }
        }

        return ans;
    }
}