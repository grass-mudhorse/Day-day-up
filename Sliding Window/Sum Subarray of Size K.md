Problem Statement #
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
Example 2:

Input: [2, 3, 4, 1, 5], k=2 
Output: 7
Explanation: Subarray with maximum sum is [3, 4].

```java
public static int findMaxSumSubArray(int k, int[] arr) {
        // get the sum of k number
        int maxSum = 0, windowSum = 0, start = 0;
        for (int i = 0; i <= k - 1; i++)
            windowSum += arr[i];

        // move forward from k
        for (int i = k; i < arr.length; i++) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[start];
            windowSum += arr[i];
            start++;
        }
        return maxSum;
    }
```