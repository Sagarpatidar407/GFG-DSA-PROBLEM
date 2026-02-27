import java.util.*;

class Solution {
    
    private boolean isSafe(int[][] maze, int n, int x, int y, int[][] visited){
        return (x >= 0 && x < n &&
                y >= 0 && y < n &&
                visited[x][y] == 0 &&
                maze[x][y] == 1);
    }
    
    private void solve(int[][] maze, int n, int x, int y,
                       StringBuilder path,
                       ArrayList<String> ans,
                       int[][] visited){
        
        // Destination reached
        if(x == n-1 && y == n-1){
            ans.add(path.toString());
            return;
        }
        
        visited[x][y] = 1;
        
        // D
        if(isSafe(maze, n, x+1, y, visited)){
            path.append('D');
            solve(maze, n, x+1, y, path, ans, visited);
            path.deleteCharAt(path.length() - 1);
        }
        
        // L
        if(isSafe(maze, n, x, y-1, visited)){
            path.append('L');
            solve(maze, n, x, y-1, path, ans, visited);
            path.deleteCharAt(path.length() - 1);
        }
        
        // R
        if(isSafe(maze, n, x, y+1, visited)){
            path.append('R');
            solve(maze, n, x, y+1, path, ans, visited);
            path.deleteCharAt(path.length() - 1);
        }
        
        // U
        if(isSafe(maze, n, x-1, y, visited)){
            path.append('U');
            solve(maze, n, x-1, y, path, ans, visited);
            path.deleteCharAt(path.length() - 1);
        }
        
        visited[x][y] = 0;   // Backtrack
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        
        // Important edge case
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0)
            return ans;
        
        int[][] visited = new int[n][n];
        StringBuilder path = new StringBuilder();
        
        solve(maze, n, 0, 0, path, ans, visited);
        
        return ans;   // Already lexicographically sorted due to order
    }
}