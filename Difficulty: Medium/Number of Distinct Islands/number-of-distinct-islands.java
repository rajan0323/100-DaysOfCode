//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int dfs(int i ,int j,int[][] grid,ArrayList<Integer> li, int row , int col){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        li.add(i-row);
        li.add(j-col);
        
        dfs(i+1,j,grid,li,row,col);
        dfs(i-1,j,grid,li,row,col);
        dfs(i,j+1,grid,li,row,col);
        dfs(i,j-1,grid,li,row,col);
        return 0;
        
    }

    int countDistinctIslands(int[][] grid) {
        int m  = grid.length;
        int n = grid[0].length;
       
        HashSet<ArrayList<Integer>> sb = new HashSet<>();
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                ArrayList<Integer> li = new ArrayList<>();
                if(grid[i][j]==1){
                dfs(i,j,grid,li,i,j);
                sb.add(li);
                    
                }
            }
        }
        return sb.size();
    }
}
