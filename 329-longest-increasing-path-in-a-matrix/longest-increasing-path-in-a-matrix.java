class Solution {
    // 4 cardinal directions: Up, Down, Left, Right
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // memo[i][j] stores the longest increasing path starting from cell (i, j)
        int[][] memo = new int[m][n];
        int maxPath = 0;
        
        // Calculate the maximum path starting from every possible cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentPathLength = dfs(matrix, i, j, memo);
                maxPath = Math.max(maxPath, currentPathLength);
            }
        }
        
        return maxPath;
    }
    
    private int dfs(int[][] matrix, int row, int col, int[][] memo) {
        // If the result has already been calculated for this cell, return it from cache
        if (memo[row][col] != 0) {
            return memo[row][col];
        }
        
     
