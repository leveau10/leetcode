import java.util.HashMap;

class Positions {
    public int first;
    public int second;
    public int occur;
    public Positions(int first, int second, int occur) {
        this.first = first;
        this.second = second;
        this.occur = occur;
    }
}

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Positions> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int occur =  map.get(nums[i]).occur;
                occur++;
                map.put(nums[i], new Positions(map.get(nums[i]).first, i, occur));
            }else{
                map.put(nums[i], new Positions(i, i, 1));
            }
        }
        int occur = 0;
        int shortest = nums.length;
        for (Integer key : map.keySet()) {
            if (map.get(key).occur > occur){
                shortest = map.get(key).second - map.get(key).first+1;
                occur = map.get(key).occur;
            }
            else if (map.get(key).occur == occur) {
                if ((map.get(key).second - map.get(key).first) <  shortest){
                    shortest = map.get(key).second - map.get(key).first+1;
                }
            }
        }
        return shortest;
    }
}