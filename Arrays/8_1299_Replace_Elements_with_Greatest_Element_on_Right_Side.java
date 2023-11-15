/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.
 

Constraints:

1 <= arr.length <= 10 pow 4
1 <= arr[i] <= 10 pow 5
*/

//Move Pointer from right
class Solution {
    public int[] replaceElements(int[] arr) {                
        if(arr.length>1) {
            int prev = arr[arr.length-1]; 
            for(int i=arr.length-2; i>=0; i--) {
                int max = Math.max(prev, arr[i+1]);
                prev = arr[i];
                arr[i] = max;
            }
        }
        arr[arr.length-1] = -1;
        return arr;        
    }
}


/*
 *Explanation:
 *
 * We start by pointing to last but one number and at each point we check the max of the current number and cur+1 number 
 * and place that at current position and move one position left, since the cur+1 position has the max till then, 
 * we just need to check max of cur and cur+1. Once we reach the start we end the interation and then place -1 at the last position and return the array
 */