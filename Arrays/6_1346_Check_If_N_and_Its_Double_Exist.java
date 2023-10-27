/*
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 

Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103
*/

// HashSet Java Solution
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> dict = new HashSet<Integer>();
        
        for(int num : arr) {
            if(dict.contains(2*num) || ((num%2==0) && dict.contains(num/2))) {
                return true;
            } 

            dict.add(num);
        }
        
        return false;
    }
}

/*
 * Explanation:
 * 
 * Initialize a HashSet and iterate over the array and store the num in Hashset
 * During this step itself check if the double of it or half of it if the number is even is present in the Hashset
 * if found immediately return true else complete iteration and return false
 */