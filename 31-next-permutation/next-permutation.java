class Solution {
    public void nextPermutation(int[] nums) {
        
        next(nums);   

        // print updated array
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
      public static void next(int[]arr){
        int p=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        int q=-1;
        for(int j=arr.length-1;j>p;j--){
            if(arr[j]>arr[p]){
                q=j;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr, p+1, arr.length-1);  
    }

    public static int[] reverse(int[]arr,int i ,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}