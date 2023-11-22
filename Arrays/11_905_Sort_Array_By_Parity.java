/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
*/

//2 pointer approach
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        
        while(i<j) {
            while(i<j && nums[i]%2==0) {
                i++;
            }
            while(i<j && nums[j]%2!=0) {
                j--;
            }
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        return nums;
    }
}

/*
 * Explanation:
 * 
 * Use 2 pointers and do a while loop until both of them cross each other. keep moving right with left pointer until you find a odd value and stop, 
 * similarly keep moving left with right pointer until you find a even number, then swap both the values and again start moving till pointers cross.
 */