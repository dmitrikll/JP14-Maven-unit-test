package org.example;

public class Task02 {

    public int numGoodPair(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i += 1) {
            for (int j = i + 1; j < nums.length; j += 1) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
