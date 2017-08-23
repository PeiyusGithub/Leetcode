class Solution {
    public int islandPerimeter(int[][] grid) {
        int colcount = 0, count = 0, temp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1) {
                    if (grid[i][j] == 1 && (j + 1) < grid[i].length && grid[i][j + 1] == 1) temp++;
                    count++;
                }       
                if (i == 0) {
                    if (grid[i][j] == 1 && (i + 1) < grid.length && grid[i+1][j] == 1 ) colcount++;
                } else if (i == grid.length - 1) {
                    if (grid[i][j] == 1 && grid[i-1][j] == 1) colcount++;
                } else {
                    if (grid[i][j] == 1 && grid[i-1][j] == 1) colcount++;
                    if (grid[i][j] == 1 && grid[i+1][j] == 1) colcount++;
                }
            }   
        }
        return (count * 4 - temp * 2 - colcount);
    }
}