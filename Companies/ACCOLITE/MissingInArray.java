// User function Template for Java
class Solution {
    int MissingNumber(int array[], int n) {
        int requiredsum = (n* (n+1))/2;
        int actualsum=0;
        for(int i= 0; i< n-1 ; i++){
             actualsum+= array[i];
        }
        return(requiredsum - actualsum );
    }
}