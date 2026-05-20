class Solution {
    public boolean isPalindrome(String s) {
        
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

int n = s.length();

char[] r = s.toCharArray();

for (int i = 0; i < n / 2; i++) {

    if (r[i] != r[n - 1 - i]) {

        return false;

    }

}

  return true;
    
        
    }
}
