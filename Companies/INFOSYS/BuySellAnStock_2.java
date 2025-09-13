// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
     int n = prices.length;
    if (n == 0) return 0; // No prices available
    
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < n; i++) {
        // Update the minimum price seen so far
        minPrice = Math.min(minPrice, prices[i]);
        // Calculate the profit if sold on the current day
        maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }

    return maxProfit;
    }
}