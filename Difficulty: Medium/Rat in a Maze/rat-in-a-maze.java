import java.util.*;

class Solution {

    static boolean isSafeToMove(int[][] maze, int n, int newx, int newy, boolean[][] visited) {

        // Boundary check
        if (newx < 0 || newx >= n || newy < 0 || newy >= n)
            return false;

        // Cell is blocked
        if (maze[newx][newy] == 0)
            return false;

        // Already visited
        if (visited[newx][newy])
            return false;

        return true;
    }

    static void solve(int[][] maze, int srcx, int srcy,
                      int desx, int desy,
                      ArrayList<String> ans,
                      boolean[][] visited,
                      String path) {

        // Destination reached
        if (srcx == desx && srcy == desy) {
            ans.add(path);
            return;
        }

        int n = maze.length;

        visited[srcx][srcy] = true;

        // Up
        int newx = srcx - 1;
        int newy = srcy;
        if (isSafeToMove(maze, n, newx, newy, visited)) {
            solve(maze, newx, newy, desx, desy, ans, visited, path + "U");
        }

        // Down
        newx = srcx + 1;
        newy = srcy;
        if (isSafeToMove(maze, n, newx, newy, visited)) {
            solve(maze, newx, newy, desx, desy, ans, visited, path + "D");
        }

        // Left
        newx = srcx;
        newy = srcy - 1;
        if (isSafeToMove(maze, n, newx, newy, visited)) {
            solve(maze, newx, newy, desx, desy, ans, visited, path + "L");
        }

        // Right
        newx = srcx;
        newy = srcy + 1;
        if (isSafeToMove(maze, n, newx, newy, visited)) {
            solve(maze, newx, newy, desx, desy, ans, visited, path + "R");
        }

        // Backtracking
        visited[srcx][srcy] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        ArrayList<String> ans = new ArrayList<>();

        // Start or destination blocked
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return ans;

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, n - 1, n - 1, ans, visited, "");

        Collections.sort(ans);

        return ans;
    }
}