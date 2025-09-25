import java.util.*;
// User function Template for Java
class Solution {
    static int majorityElement(int arr[]) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        // Count the frequency of each element
        for (int i = 0; i < n; i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        // Check if the frequency of any element is greater than n/2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}