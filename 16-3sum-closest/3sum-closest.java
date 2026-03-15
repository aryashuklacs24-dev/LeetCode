class Solution {
    public int threeSumClosest(int[] arr, int target) {
        // List<List<Integer>>result =new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int cs =arr[0]+arr[1]+arr[2];
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(Math.abs(sum-target)<Math.abs(cs-target)){
                    cs=sum;
                }

                if(sum==target){
                    return sum;
                // result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                //  left++;
                // right--;
                // while(left<right && arr[left]==arr[left-1]) left++;
                // while(left<right && arr[right]==arr[right+1]) right--;
                }
                
                else if(sum<target){
                    left++;
                }
                else if(sum>target) {
                    right--;
                }
            }
        }  
           return cs;
    }
}