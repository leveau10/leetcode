//https://leetcode.com/problems/valid-word/
class Solution {
    public boolean isValid(String word) {
        boolean vowel = false;
        boolean consonant = false;
        if (word.length() < 3) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!(c < 123 && c > 96) && !(c<91 && c> 64) && !(c >47 && c <58) ) {
                return false;
            }
            if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117 ) {
                vowel = true;
            } else if(((c < 123 && c > 96) || (c<91 && c> 64)) && !(c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117)) {
                consonant = true;
            }
        }
        if (consonant && vowel) {
            return true;
        }
        return false;
    }
}