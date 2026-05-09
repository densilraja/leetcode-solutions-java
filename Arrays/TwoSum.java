/*
-------------------------------------------------------
Problem: Two Sum
Approach: HashMap
Time Complexity: O(n)
Space Complexity: O(n)
-------------------------------------------------------

Explanation:
We use a HashMap to store each number and its index.

For every element:
1. Calculate remaining = target - current element
2. Check whether remaining already exists in map
3. If exists, return indices
4. Otherwise store current element in map

This avoids nested loops and optimizes the solution
from O(n²) to O(n).
-------------------------------------------------------
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];

            if(map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
