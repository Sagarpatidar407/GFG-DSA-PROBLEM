class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(mat[j][i]);
            }
            matrix.add(row);
        }
        
        return matrix;
        
    }
}