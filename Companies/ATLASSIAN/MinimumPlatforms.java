import java.util.Arrays;
import java.util.PriorityQueue;
// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int n = arr.length;
        int[][] newArr = new int[n][2];

        for (int i = 0; i < n; i++) {
            newArr[i][0] = arr[i];
            newArr[i][1] = dep[i];
        }

        // Sort based on arrival time
        Arrays.sort(newArr, (a, b) -> Integer.compare(a[0], b[0]));

        // Priority Queue (Min Heap) to store departure times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add the first train's departure
        pq.add(newArr[0][1]);

        for (int i = 1; i < n; i++) {
            // If the current train arrives after the earliest departure, remove it
            if (newArr[i][0] > pq.peek()) {
                pq.poll();
            }
            pq.add(newArr[i][1]); // Add current train's departure
        }

        // The size of the priority queue will be the minimum number of platforms needed
        return pq.size();
    }
}