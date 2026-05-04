class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverseRow(matrix[i]);
        }
    }
     public static void transpose(int[][]arr){
        int row =arr.length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

     public static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}