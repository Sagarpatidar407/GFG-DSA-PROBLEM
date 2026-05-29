class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        
        int[] arr = new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[0].length;j++){
                sum = sum + mat[i][j];
            }
            arr[i] = sum;
        }
        
        return arr;
    }
}