class Solution {
    String firstAlphabet(String s) {
    StringBuilder result = new StringBuilder();
    int n = s.length();
    for (int i = 0; i < n; i++) {
        if (i == 0 || s.charAt(i-1) == ' ') {
            result.append (s.charAt(i));
        }
    } 
     return result.toString();   
    }
};