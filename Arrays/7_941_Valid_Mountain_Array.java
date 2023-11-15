/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
*/

//Pointer logical approach
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        
        int mid=0;
        
        while(mid+1<n) {
            if(arr[mid+1] == arr[mid]) {
                return false;
            } else if (arr[mid+1]<arr[mid]) {
                break;
            }
            mid+=1;
        }
        
        if(mid==n-1 || mid==0) {
            return false;
        }
        
        while(mid+1<n){
            if(arr[mid]<=arr[mid+1]){
                return false;
            }
            mid += 1;
        }
        
        return true;
    }
}

/*
 * Explanation
 * 
 * We use a pointer throughout the problem, first we check if the lenght is greater than or equal to 3 then only we proceed else return false
 * Then the first part is to move the pointer until it's strictly increasing, at the same time we check if the values repeat and return false
 * Once we reach that point we check if the pointer is at first or last position because in that case it will not be a mountain
 * we now move to the second part of the solution, Here we check if the value is strictly decreasing till we reach the end of the array
 * If everything goes well till the end then we will return true
 */
