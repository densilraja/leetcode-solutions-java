/*
    LeetCode Problem: 219. Contains Duplicate II
    Category: Arrays | HashSet | Sliding Window

    Intuition:
    We need to check whether the same number appears again
    within a distance of k indices.

    Approach:
    - Use a HashSet to maintain a sliding window of size k.
    - If the current element already exists in the set,
      duplicate found within range -> return true.
    - Add current element to the set.
    - Remove elements that move out of the window.

    Time Complexity -> O(n)
    Space Complexity -> O(k)
*/

import java.util.HashSet;

class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Duplicate found inside window
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element
            set.add(nums[i]);

            // Maintain sliding window size
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}
