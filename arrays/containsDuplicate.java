package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate{
    public static void main(String[] args) {
        int[] arr = { 2,14,18,22,22 };
        var result = checkDuplicates(arr);
        System.err.println(result);
      }
    // brute force approach
    public static boolean checkDuplicates(int nums[]) {
        if (nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int prevIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prevIdx]==nums[i]) {
                return true;
            }
            prevIdx=i;
        }


        return false;
    }

    // optimal solution
    public static boolean checkDuplicates2(int nums[]) {
        Set<Integer> count = new HashSet<Integer>();
        for (int num : nums) {
            if (count.contains(num)) {
                return true;
            }
            count.add(num);            
        }

        return false;


    }
}
