package Arrays;

import java.util.*;
public class MissingNumber {
	public static int findMissingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5}; 
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }
	
}
