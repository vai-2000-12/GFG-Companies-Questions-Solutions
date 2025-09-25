import java.util.* ;
// User function Template for Java
class Solutions {
    public static int kthSmallest(int[] arr, int k) {
      Arrays.sort(arr);
      return arr[k-1];
    }
}