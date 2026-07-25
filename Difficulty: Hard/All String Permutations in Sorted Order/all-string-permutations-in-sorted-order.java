class Solution {
    
    public void solve(String s, String output, ArrayList<String> ans){
        
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            String remain = s.substring(0,i) + s.substring(i+1);
            solve(remain,output+curr,ans);
        }
        
    }
    
    public ArrayList<String> permutation(String s) {
        // code here
        
        ArrayList<String> ans = new ArrayList<>();
        
        solve(s, "", ans);
        
        Collections.sort(ans);
        return ans;
        
    }
}