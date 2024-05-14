//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
        int nSize = needle.length();
        int index = -1;
        for (int i = 0; i < haystack.length()-nSize+1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i+nSize).equals(needle)) {
                    return i;
                }
            }
        }
        return index;
    }
}
