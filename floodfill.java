public class floodfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color==newColor){
            return image;
        }
        dfs(image,  sr,  sc,  newColor, color);
        return image;
    }   

    public void dfs(int[][] image, int sr, int sc, int newColor, int oldColor){
        if(sr<0||sr>=image.length||sc<0||sc>=image[sr].length||image[sr][sc]!=oldColor){
            return;
        }
        image[sr][sc]= newColor;
        dfs(image, sr+1, sc, newColor, oldColor);
        dfs(image, sr-1, sc, newColor, oldColor);
        dfs(image, sr, sc+1, newColor, oldColor);
        dfs(image, sr, sc-1, newColor, oldColor);
    }
}
