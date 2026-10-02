class Solution {
    public String removeSpaces(String s) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}