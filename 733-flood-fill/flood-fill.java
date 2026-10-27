class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevcolor=image[sr][sc];

        if(prevcolor == color){
          return image;
        }   
        
        dfs(sr,sc,image,color,prevcolor);

        return image;

    }
    public static void dfs(int sr,int sc,int[][]img,int color,int prevcolor){
        if(sr<0||sr>=img.length||sc<0||sc>=img[0].length){
            return;
        }
        if(img[sr][sc]!=prevcolor){
            return;
        }

        img[sr][sc]=color;

        dfs(sr+1,sc,img,color,prevcolor);
        dfs(sr,sc+1,img,color,prevcolor);
        dfs(sr-1,sc,img,color,prevcolor);
        dfs(sr,sc-1,img,color,prevcolor);
    }
}