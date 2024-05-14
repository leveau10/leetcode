//https://leetcode.com/problems/reducing-dishes/
import java.util.Arrays;
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int best = 0;
        int newBest = 0;
        int count = 1;
        for (int i = 0; i < satisfaction.length; i++) {
            count = 1;
            for (int j = i; j < satisfaction.length; j++) {
                newBest += satisfaction[j] * count;
                count++;
            }
            if (newBest > best) {
                best = newBest;
            }
            newBest = 0;
        }
        return best;
    }
}