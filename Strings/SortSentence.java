/*
Problem: Sorting the Sentence
Platform: LeetCode
Difficulty: Easy

Approach:
1. Split the sentence into words.
2. Every word contains a digit at the end representing its position.
3. Extract the position and place the word in correct index.
4. Join the array and return final sentence.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String sortSentence(String s) {

        // Split sentence into words
        String[] words = s.split(" ");

        // Result array to store words in correct order
        String[] result = new String[words.length];

        // Traverse all words
        for (String word : words) {

            // Extract position from last character
            int index = word.charAt(word.length() - 1) - '1';

            // Store word without last digit
            result[index] = word.substring(0, word.length() - 1);
        }

        // Join words with spaces
        return String.join(" ", result);
    }
}
