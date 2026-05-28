class Solution {
    public static int firstRepeated(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            
            if(map.containsKey(arr[i])) {
                
                ans = Math.min(ans, map.get(arr[i]));
                
            } else {
                
                map.put(arr[i], i + 1); // store 1-based index
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}