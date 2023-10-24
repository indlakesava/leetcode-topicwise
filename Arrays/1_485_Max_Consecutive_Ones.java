/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

//Java Solution
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int ans = 0;
        
        while(i<nums.length && j<nums.length) {
            if(nums[j++]==1) {
                ans = Math.max(ans, j-i);
            } else {
                i=j;
            }
        }
        
        return ans;
    }
}

/*
 * Explanation:
 * We are using 2 pointer approach which could have also been done through current_max and globla_max approach
 * We use these 2 pointer to plot both the edges of the consecutive ones and calculate the length 
 * Once the length is found we check if this can be the maximum length by comparing with the macimum consecutive one till now
 * 
 * Time complexity - O(n)
 * Space complexity - O(1) 
 */