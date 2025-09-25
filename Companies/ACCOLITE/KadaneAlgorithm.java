// User function Template for Java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Initialize the Global Variable With name MaxStart , maxEnd
       int maxStart = arr[0];
       int maxEnd = arr[0];
       
       for( int i = 1 ; i < arr.length ; i++){
           maxStart = Math.max(arr[i], maxStart + arr[i]);
           maxEnd = Math.max(maxStart , maxEnd);
       }
       return maxEnd;
    }
}