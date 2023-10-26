/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 

Follow up: Can you come up with an algorithm that runs in O(m + n) time?
*/



//Bruteforce Java Solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        
        while(n>0){
            nums1[k] = nums2[n-1];
            n-=1;
            k-=1;
        }

        Arrays.sort(nums1);
    }
}

/*
 * Explanation:
 * 
 * Just copy the numbers from array 2 to array 1 and then sort array1.
 * Here we are missing the added advantage of already sorted arrays hence optimized solution
 */



//Optimized
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;

        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[k] = nums1[m-1];
                m-=1;
            } else{
                nums1[k] = nums2[n-1];
                n-=1;
            }
            k-=1;
        }
        
        while(n>0){
            nums1[k] = nums2[n-1];
            n-=1;
            k-=1;
        }
    }
}

/*
 * Explanation:
 * 
 * Since the 2 arrays are already sorted and the first array have enough space for all the nums,
 * we start from the edges of both the arrays moving backwards, at each point we check the last value in both the arrays
 * and compare, the larger once takes the last possible place in array1
 * Finally what's leftover in n is copied over
*/