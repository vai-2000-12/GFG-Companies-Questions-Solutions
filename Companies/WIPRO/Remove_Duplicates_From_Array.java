

// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
      int n = arr.length;
        
        if(n <= 1)
        {
            return n;
        }
        
        int index = 1;
        
        for(int i = 1; i < n; i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}