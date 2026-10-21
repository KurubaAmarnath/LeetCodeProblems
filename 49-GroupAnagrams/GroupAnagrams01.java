class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i =0; i<strs.length;i++){
            if ( used[i]){
                continue;
            }
             ArrayList<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i]=true;
            for ( int j = i+1;j<strs.length;j++){
                if(used[j]){ continue;}
                if(strs[i].length()!=strs[j].length()){continue;}
                int[] freq = new int[26];
                for( int k = 0; k<strs[i].length();k++){
                    freq[strs[i].charAt(k)-'a']++;
                    freq[strs[j].charAt(k)-'a']--;
                }
                boolean isAnagram = true;
                for ( int k = 0;k<freq.length;k++){
                    if(freq[k]!=0){
                        isAnagram=false;
                        break;
                    }
                }
                if(isAnagram){
                    group.add(strs[j]);
                    used[j]=true;
                }
            }
            result.add(group);
    
            }
            return result;
        }
        
    }
