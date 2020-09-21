/*33. Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.*/

import java.util.*;

public class StringsRearrangement {

    boolean stringsRearrangement(String[] inputArray) {
        int n = inputArray.length;
        HashSet<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            visited.add(i);
            if (stringsRearrangementHelper(visited, inputArray[i], inputArray)) {
                return true;
            }
            visited.remove(i);
        }
        return false;
    }

    boolean stringsRearrangementHelper(HashSet<Integer> visited, String current, String[] inputArray) {
        if (visited.size() == inputArray.length) {
            return true;
        }

        int n = inputArray.length;
        for (int i = 0; i < n; i++) {
            if (visited.contains(i)) {
                continue;
            }
            if (differsByOne(current, inputArray[i])) {
                visited.add(i);
                if (stringsRearrangementHelper(visited, inputArray[i], inputArray)) {
                    return true;
                }
                visited.remove(i);
            }
        }

        return false;
    }

    boolean differsByOne(String a, String b) {
        boolean flag = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (flag) {
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }
}
