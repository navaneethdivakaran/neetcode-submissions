class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freqmap= new HashMap<>();
        for(char c:s.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> freqmap1= new HashMap<>();
        for(char c:t.toCharArray()){
            freqmap1.put(c,freqmap1.getOrDefault(c,0)+1);
        }
        // for(char c:t.toCharArray()){
        //     if (!freqmap.get(c).equals(freqmap1.get
        //     (c)))
        //     return false;
        // }
        // return true;

        if(freqmap.equals(freqmap1))
        return true;
        else 
        return false;

    }
}
