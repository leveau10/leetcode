//https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                array[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = array[i];
        }
        return k;
    }
}
