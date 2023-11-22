/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
*/

//2 pointer approach
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        
        while(i<nums.length) {
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        
        while(j<nums.length) {
            nums[j]=0;
            j++;
        }
    }
}

/*
 * Explanation: 
 * 
 * Traverse entire array till end and keep placing all the non zero elements together in the same order,
 * Once we reach the end of the array, do second iteration for rest of the array to place all the remaining loactions with zeroes.
 */