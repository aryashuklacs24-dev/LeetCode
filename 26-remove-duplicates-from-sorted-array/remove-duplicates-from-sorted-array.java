class Solution {
    public int removeDuplicates(int[] nums) {
         int k=Remove(nums);
        System.out.println(k);
        for(int m=0;m<k;m++){
        System.out.print(nums[m]+" ");
        }
        return k;
    }

     public static int Remove(int[]arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}