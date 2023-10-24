/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
*/



//Brute-Force java solution
class Solution {
    // Helper function to check if the number of digits is even
    private boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while (num != 0) {
            digitCount++;
            num /= 10;
        }
        return (digitCount & 1) == 0;
    }

    public int findNumbers(int[] nums) {
        // Counter to count the number of even digit integers
        int evenDigitCount = 0;

        for (int num : nums) {
            if (hasEvenDigits(num))
                evenDigitCount++;
        }

        return evenDigitCount;
    }
}

/*
 * Explanation:
 * 
 * Here we are creating a function to check if the number passed to that function has even number of digits
 * The function will keep track of length at each step where we divide the number by 10 which will truncate the last digit 
 * and we do it until the number is not zero
 */



//String conversion java solution
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        
        for(int num : nums) {
            if(String.valueOf(num).length() % 2 == 0) {
                ans += 1;
            }
        }
        
        return ans;
    }
}

/*
 * Explanation:
 * 
 * Here we convert the number to string using String.valueOf(num) function and check it's length using length function
 * if the length is divisible by 2 then it's even and we increment the counter
 * /