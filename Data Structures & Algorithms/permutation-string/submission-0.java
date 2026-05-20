class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
        return false;}
        int[] s1map= new int[26];
        int[] s2map= new int[26];
        for(char c:s1.toCharArray()){
            s1map[c-'a']++;}
        int j=0;
        for(int i=0;i<s2.length();i++){
            s2map[s2.charAt(i)-'a']++;
            if(i-j+1>s1.length()){
               s2map[s2.charAt(j)-'a']--; 
               j++;
            }
            if(matches(s1map,s2map))
            return true;
        }
        return false;
  
    }
    public boolean matches(int[]one,int[] two){
        for(int i=0;i<26; i++){
            if(one[i]!=two[i])
                return false;}
            return true; 
    }
}
