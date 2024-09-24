import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int majority = nums[0];
        for (int i : nums) {
            if (map.containsKey(i)) {
                Integer value = map.get(i);
                value++;
                if (value > nums.length/2) {
                    majority = i;
                }
                map.put(i, value);
            }else{
                map.put(i,1);
            }
        }
        return majority;
    }
}
