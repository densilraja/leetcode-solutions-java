/*
    LeetCode Problem: 283. Move Zeroes
    Category: Arrays | Two Pointers

    Intuition:
    Instead of moving zeroes multiple times,
    place all non-zero elements at the beginning
    of the array while maintaining their order.

    Approach:
    - Use a pointer 'insertPos' to track the position
      where the next non-zero element should be placed.
    - Traverse the array:
        -> If the current element is non-zero,
           place it at insertPos and increment insertPos.
    - After all non-zero elements are placed,
      fill the remaining positions with zeroes.

    Time Complexity -> O(n)
    Space Complexity -> O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        // Position to place next non-zero element
        int insertPos = 0;

        // Move all non-zero elements to the front
        for (int num : nums) {

            // Check for non-zero element
            if (num != 0) {

                nums[insertPos] = num;

                // Move insert position forward
                insertPos++;
            }
        }

        // Fill remaining positions with zeroes
        while (insertPos < nums.length) {

            nums[insertPos] = 0;

            insertPos++;
        }
    }
}
