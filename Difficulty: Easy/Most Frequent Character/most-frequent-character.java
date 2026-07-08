class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        
        int[] freq = new int[26];
        
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            freq[ch-'a']++;
        }
        
        int max = -1;
        char ans = 'a';
        
        for(int k=0;k<26;k++){
            if(freq[k] > max){
                max = freq[k];
                ans = (char)(k + 'a');
            }    
        }
        
        return ans;
        
    }
}