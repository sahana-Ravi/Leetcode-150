class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();                 // remove trailing spaces
        int k = s.length() - 1;       // start at last character
        char[] c = s.toCharArray();
        int length = 0;
        while (k >= 0 && c[k] != ' ') {
            length++;
            k--;
        }

        return length;
    }
}
