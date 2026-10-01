class Solution {
    public static int sumSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
             count = count + Integer.parseInt (s.substring (i,j));
            }
        } return count; 
        
    }
}