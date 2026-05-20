class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
         int max = 0;
        int n =s.length();
        Map<Character,Integer> map=new HashMap<>();
        // char[] t=s.toCharArray();
        for (int i=0;i<n;i++){
             char ch = s.charAt(i);
           if (map.containsKey(ch)){
                l = Math.max(l, map.get(ch) + 1);
            }
            map.put(ch,i);
            max = Math.max(max, i - l + 1);
        }
        return max;

        
    }
}
