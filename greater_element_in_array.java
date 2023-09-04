import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        //O(N)
        //S(1)
        int maxi = 0;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
}
