import java.util.*;
class Solution {

    void mergeSort(int arr[], int l, int r) {
       //Lets Start Coding :-
       if(l == r){
          return;
       }
       
      int mid = l + (r-l)/2;
      
      mergeSort(arr , l , mid);
      mergeSort(arr , mid+1 , r);
      merge(arr , l , mid , r);
    }
    
    public void merge(int [] arr , int l , int mid , int r){
           int n = arr.length;
            ArrayList<Integer> li = new ArrayList<>();
            int left=l;
            int right=mid+1;
            
        while(left<=mid && right<=r)
        {
            if(arr[left]<=arr[right])
            {
                li.add(arr[left]);
                left++;
            }
            else
            {
                li.add(arr[right]);
                right++;
            }
        }
        
        while(left<=mid)
        {
            li.add(arr[left]);
            left++;
        }
        
        while(right<=r)
        {
            li.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++)
        {
            arr[i]=li.get(i-l);
        }
    }
}