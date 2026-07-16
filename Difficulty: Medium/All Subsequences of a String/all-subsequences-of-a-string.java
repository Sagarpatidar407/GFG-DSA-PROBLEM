class Solution {
    
    public void subsequences(String s, int index, StringBuilder output, List<String> ans){
        
        if(index >= s.length()){
            String out = output.toString();
            ans.add(out);
            return;
        }
        
        char ch = s.charAt(index);
        
        output.append(ch);
        //include
        subsequences(s,index+1,output,ans);
        //exclude
        output.deleteCharAt(output.length()-1);
        subsequences(s,index+1,output,ans);
        
        
        
    }
    
    public List<String> powerSet(String s) {
        // Code here
        
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        
        subsequences(s, 0, output, ans);
        Collections.sort(ans);
        
        return ans;
        
    }
}