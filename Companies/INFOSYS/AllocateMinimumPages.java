//Back-end complete function Template for Java
class Solution {
    public static int findPages(int[] arr, int k) {
        // Base case: If there are fewer books than students, allocation is not possible
        if (arr.length < k) {
            return -1;
        }
        
        int low = Integer.MIN_VALUE; // Start with the maximum of the array as the minimum pages
        int high = 0; // Total sum of all pages
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        
        int result = high; // Initialize result to the maximum sum
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Midpoint for binary search
            
            // Check if it is possible to allocate `mid` pages
            if (isPossible(arr, k, mid)) {
                result = mid; // Update result to the minimum feasible value
                high = mid - 1; // Try for a smaller allocation
            } else {
                low = mid + 1; // Try for a larger allocation
            }
        }
        
        return result;
    }
    
    // Helper function to check if a given maxPages can be allocated
    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int studentCount = 1; // Start with one student
        int currentSum = 0;
        
        for (int pages : arr) {
            // If adding this book exceeds maxPages, assign it to the next student
            if (currentSum + pages > maxPages) {
                studentCount++;
                currentSum = pages; // Reset currentSum to the current book's pages
                
                // If the number of students exceeds k, allocation is not possible
                if (studentCount > k) {
                    return false;
                }
            } else {
                currentSum += pages;
            }
        }
        
        return true; // Allocation is possible
    }
}
