class Solution {
    int[][] dirs={{0,1},{1,0},{-1,0},{0,-1}};
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid1.length;
        int n=grid1[0].length;
        
        // First sink the land in Grid2 which are under water in Grid1.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid1[i][j]==0){
                    dfs(grid2,i,j,0);
                }
            }
        }
        
        int cnt=0;
        // Now determine the islands in grid2.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    dfs(grid2,i,j,0);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public void dfs(int[][] grid,int i,int j,int val){
        if(grid[i][j]==val){
            return;
        }
        grid[i][j]=val;
        
        for(int[] dir : dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x<0 || y<0 || x>=grid.length || y>=grid[0].length){
                continue;
            }
            dfs(grid,x,y,val);
        }
    }
}
