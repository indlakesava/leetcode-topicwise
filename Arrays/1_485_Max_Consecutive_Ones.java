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



//Sliding Window Java Solution
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



//Current_max, Global_max Java Solution
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);
            }
            else count = 0;
        }
        
        return result;
    }
}

/*
 * Explanation:
 * We are using current_max and globla_max approach
 * We use result to store the global max and count to store the current_max
 * Once we start looping through the array there can be one of the 2 cases we might encounter 1 or 0
 * if we see 1 we keep iterating else if we come across 0 we then check the current_max and try to compare with global_max and update accordingly
 * and set the current_max to 0 and continue with further iterations until the end of the array
 * 
 * Time complexity - O(n)
 * Space complexity - O(1) 
 */