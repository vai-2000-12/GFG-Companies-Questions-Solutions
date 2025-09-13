// User function Template for Java
class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivotIndex = -1;

        // Find the pivot index (rightmost element smaller than its next)
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        // If no pivot index is found, reverse the array (last permutation)
        if (pivotIndex == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Find the element just larger than the pivot and swap
        for (int i = n - 1; i > pivotIndex; i--) {
            if (arr[i] > arr[pivotIndex]) {
                swap(arr, i, pivotIndex);
                break;
            }
        }

        // Reverse the sub-array to the right of the pivot index
        reverse(arr, pivotIndex + 1, n - 1);
    }
}