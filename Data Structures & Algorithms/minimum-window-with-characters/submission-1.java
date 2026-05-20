class Solution {
    public String minWindow(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];
        if(t.length()>s.length()){
            return "";
        }
        for(char c: t.toCharArray()){
            tmap[c]++;
        }
        int j=0;int maxlen=s.length()+1; int minstart=0;
        for(int i=0;i<s.length();i++){
            smap[s.charAt(i)]++;
        while(contains(smap,tmap)){
            if(i-j+1<maxlen){
                maxlen=i-j+1;
                minstart=j;
            }
            smap[s.charAt(j++)]--;
        }
       

        
    } return maxlen==s.length()+1 ? "":s.substring(minstart,maxlen+minstart);
    }
    private boolean contains(int [] s1,int[] s2){
        for(int i=0;i<s1.length;i++){
            if(s2[i]>s1[i])
            return false;
        }
        return true;
    }
}
