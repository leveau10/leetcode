//https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedArray = new ArrayList<>();
        for (int i : nums1) {
            mergedArray.add(i);
        }
        for (int i : nums2) {
            mergedArray.add(i);
        }
        mergedArray.sort(Comparator.naturalOrder());
        if (mergedArray.size()%2 == 0) {
            double median = (mergedArray.get(mergedArray.size()/2) + mergedArray.get((mergedArray.size()/2) -1))/ 2.0;
            return median;
        }else{
            double median = mergedArray.get(mergedArray.size()/2);
            return median;
        }
    }
}