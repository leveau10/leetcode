//https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != 32) {
                for (int j = i-1; j >= 0; j--) {
                    if (s.charAt(j) == 32) {
                        return count;
                    }
                    count++;
                    if(j==0){
                        return count;
                    }
                }
            }
        }
        return count;
    }
}