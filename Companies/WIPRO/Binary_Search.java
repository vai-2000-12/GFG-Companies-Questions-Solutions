// User function Template for Java
class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n =  arr.length;
        int st = 0;
        int end = n-1;
        
        while(st <= end){
          int mid = st + (end - st)/2;
             if(arr[mid] == k ){
               while(mid > 0 && arr[mid-1] == k){
                   mid--;
               }  
               return mid;
            }else if(arr[mid] < k){
                st = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}