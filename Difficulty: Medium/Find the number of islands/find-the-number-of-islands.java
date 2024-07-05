//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {
    // Helper method to perform DFS
    private void dfs(char[][] grid, int i, int j) {
        // Base case: check if we are out of bounds or at a cell that is not land ('1')
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }

        // Mark the current cell as visited
        grid[i][j] = '$';

        // Recursive DFS calls in the eight directions
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j + 1);
        dfs(grid, i + 1, j - 1);
        dfs(grid, i - 1, j + 1);
        dfs(grid, i - 1, j - 1);
    }

    // Method to count the number of islands
    public int numIslands(char[][] grid) {
        // Edge case: if the grid is empty
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int islandCount = 0;

        // Traverse each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If a cell is land ('1'), perform DFS and increment the island count
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    // Main method for testing
}
