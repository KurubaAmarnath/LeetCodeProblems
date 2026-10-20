class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for ( int i = 0;i < s.length(); i++){
            freq[s.charAt(i) -'a']++;
        }
        for ( int j = 0; j< t.length();j++){
            freq[t.charAt(j)-'a']--;
        }
        for ( int i = 0; i<freq.length;i++){
            if ( freq[i]!=0){
                return false;
            } 
        }
        return true;
        
    }
}